class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }
        double p = Math.log10(n) / Math.log10(3);
        return (int)p==p;
    }
}