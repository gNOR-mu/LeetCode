class Solution {
    public String concatHex36(int n) {
        int n2 =n*n;
        return transform(16,n2)+transform(36,n2*n);
    }

    static String transform(int base, int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int mod = n % base;
            n = n / base;
            if (mod > 9) {
                sb.insert(0, (char) (mod + 55));
            } else {
                sb.insert(0, mod);
            }
        }
        return sb.toString();
    }

}