public class Solution {
    public int findNthDigit(int n) {
        long digitLength = 1;
        long count = 9;
        long start = 1;

        // Step 1: Find the range
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }

        // Step 2: Find the actual number
        long number = start + (n - 1) / digitLength;

        // Step 3: Find the digit
        String numStr = String.valueOf(number);
        return numStr.charAt((int)((n - 1) % digitLength)) - '0';
    }
}