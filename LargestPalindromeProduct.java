class Solution {
    public int largestPalindrome(int n) {
        if (n == 1) return 9;

        long upper = (long)Math.pow(10, n) - 1;
        long lower = (long)Math.pow(10, n - 1);

        for (long i = upper; i >= lower; i--) {
            long palindrome = createPalindrome(i);

            for (long j = upper; j * j >= palindrome; j--) {
                if (palindrome % j == 0) {
                    long other = palindrome / j;
                    if (other >= lower && other <= upper) {
                        return (int)(palindrome % 1337);
                    }
                }
            }
        }
        return -1;
    }

    private long createPalindrome(long num) {
        long palindrome = num;
        long temp = num;
        while (temp > 0) {
            palindrome = palindrome * 10 + temp % 10;
            temp /= 10;
        }
        return palindrome;
    }
}