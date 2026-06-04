class Solution {
    public int removeDuplicates(int[] nums) {
        
        // If array has only one element
        if (nums.length == 1) {
            return 1;
        }

        int j = 0; // Pointer for unique elements

        for (int i = 1; i < nums.length; i++) {

            // If current element is different
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        // Number of unique elements
        return j + 1;
    }
}