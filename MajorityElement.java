public class MajorityElement {
    public static int majorityElement(int[] arr) {
        int n = arr.length;
        int candidate = -1;
        int count = 0;

        // Find a candidate for the majority element
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        // Check if the candidate is the majority element
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        }

        return -1; // No majority element found
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int result1 = majorityElement(arr1);
        System.out.println("Example 1: " + result1); 

        int[] arr2 = {3, 1, 3, 3, 2};
        int result2 = majorityElement(arr2);
        System.out.println("Example 2: " + result2); 
    }
}
