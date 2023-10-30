public class MinJumpsToReachEnd {
    public static int minJumps(int[] arr, int N) {
        if (N <= 1) {
            return 0; // If the array is of length 0 or 1, no jumps are needed.
        }

        if (arr[0] == 0) {
            return -1; // If the first element is 0, we cannot make any progress.
        }

        int maxReach = arr[0]; // Maximum reachable index from the current position.
        int steps = arr[0]; // Number of steps to reach the current maxReach.

        int jumps = 1; // Initialize the number of jumps to 1 because we are already at the first element.

        for (int i = 1; i < N; i++) {
            if (i == N - 1) {
                return jumps; // We have reached the end of the array.
            }

            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;

            if (steps == 0) {
                jumps++;

                if (i >= maxReach) {
                    return -1; // If we cannot move further, return -1 as it's not possible to reach the end.
                }

                steps = maxReach - i;
            }
        }

        return -1; // If we haven't reached the end, return -1.
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int N1 = 11;
        System.out.println("Example 1: " + minJumps(arr1, N1)); // Output: 3

        int[] arr2 = {1, 4, 3, 2, 6, 7};
        int N2 = 6;
        System.out.println("Example 2: " + minJumps(arr2, N2)); // Output: 2
    }
}
