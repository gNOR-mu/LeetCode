class Solution {
    public int arrangeCoins(int n) {
        return (int)(-0.5 + Math.sqrt((long)2 * n + 0.25));
    }
}