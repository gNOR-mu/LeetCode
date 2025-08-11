class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1 ){
            return false;
        }
        double p = Math.log10(n) / Math.log10(4);
        return (int)p==p; 
    }
}