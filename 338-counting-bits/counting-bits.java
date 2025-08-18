class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        int start = 0;
        for (int i = 1; i < res.length; i++) {
            res[i] = Integer.bitCount(i);
        }
        return res;
    }

    // public int countBitsNumber(int n) {
    //     int bits = 0;
    //     while (n > 0) {
    //         if ((n & 1) == 1) {
    //             bits++;
    //         }
    //         n >>= 1;
    //     }
    //     return bits;
    // }
}