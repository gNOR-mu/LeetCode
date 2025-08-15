class Solution {
    public String concatHex36(int n) {
        return transform(16,n*n)+transform(36,n*n*n);
    }

    static String transform(int base, int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int mod = n % base;
            n = n / base;
            char c = (char) (mod > 9 ? 'A' + (mod - 10) : '0' + mod);
            sb.insert(0, c);
        }
        return sb.toString();
    }

}