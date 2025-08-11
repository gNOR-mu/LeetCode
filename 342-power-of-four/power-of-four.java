class Solution {
    public boolean isPowerOfFour(int n) {
        double p = Math.log10(n) / Math.log10(4);
        return (int)p==p; 
    }
}