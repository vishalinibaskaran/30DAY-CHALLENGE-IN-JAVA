class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        
        // Expected sum of 0 to n
        int expected = n * (n + 1) / 2;
        
        // Actual sum
        int actual = 0;
        for (int num : nums) {
            actual += num;
        }
        
        // Missing number
        return expected - actual;
    }
}