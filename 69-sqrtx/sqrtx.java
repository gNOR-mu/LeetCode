class Solution {
    public int mySqrt(int x) {
       if (x == 1) {
            return x;
        }
        int div = x / 2;

        while ((double) div * div > x) {
            div /= 2;
        }
        if (div * div == x)
            return div;
        int res = 0;
        for (int i = div; i <= 2 * div; i++) {
            double multi =(double) i * i;
            if (multi == x) {
                return i;
            }
            if (multi > x) {
                return i - 1;
            }
            res = i;
        }
        return res;
    }
}