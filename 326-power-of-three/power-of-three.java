class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1 || (n&1)==0){
            return false;
        }
        double p = Math.log10(n) / Math.log10(3);
        return (int)p==p;
    }
}