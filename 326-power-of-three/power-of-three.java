class Solution {
    public boolean isPowerOfThree(int n) {
        double p = Math.log10(n) / Math.log10(3);
        return (int)p==p; 
    }
}