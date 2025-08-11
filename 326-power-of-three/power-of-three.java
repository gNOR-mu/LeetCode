class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n<1){
        //     return false;
        // }
        // double p = Math.log10(n) / Math.log10(3);
        // return (int)p==p;
        if (n < 1 || (n & 1) == 0) {
            return false;
        }
        double p = Math.log10(n) / 0.47712125471966244; // 0.47712125471966244 log10(3)
        return (int) p == p;
        // return 1_162_261_467 % n == 0;
    }
}