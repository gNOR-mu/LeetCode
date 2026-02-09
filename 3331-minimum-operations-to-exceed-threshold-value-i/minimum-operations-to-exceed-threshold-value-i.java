class Solution {
    public int minOperations(int[] nums, int k) {
        int less = 0;
        for (int num : nums) {
            if (num < k) {
                less++;
            }
        }
        return less;
    }
}