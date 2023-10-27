public static int removeDuplicates(int[] nums) {
    if (nums == null || nums.length == 0) {
        return 0; // Nothing to remove in an empty array.
    }

    int uniqueCount = 1; // At least one unique element in the sorted array.

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[uniqueCount] = nums[i];
            uniqueCount++;
        }
    }

    return uniqueCount;
}
