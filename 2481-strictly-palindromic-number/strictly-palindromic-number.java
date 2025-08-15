class Solution {
    public static boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            if (!basePalindromic(i, n)) {
                return false;
            }
        }
        return true;
    }

    static boolean basePalindromic(int base, int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int mod = n % base;
            n /= base;
            sb.append(mod);
        }
        String s = sb.toString();
        return s.equals(sb.reverse().toString());
    }
}