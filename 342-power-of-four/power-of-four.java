class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1 || n>1 && (n&1)==1){
            return false;
        }
        double p = Math.log10(n) / 0.6020599913279624; // 0.6020599913279624 log10(4)
        return (int)p==p; 
    }
}