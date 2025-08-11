class Solution {
    public boolean isPowerOfFour(int n) {
        double p = Math.log10(n) / 0.6020599913279624; // 0.6020599913279624 log10(4)
        return (int)p==p; 
    }
}