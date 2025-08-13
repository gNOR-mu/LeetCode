class Solution {
    public int fib(int n) {
        int[] nums = { 0, 1, 0 };
        for (int i = 0; i < n; i++) {
            nums[2] = nums[0] + nums[1];
            nums[0] = nums[1];
            nums[1] = nums[2];
        }
        return nums[0];
    }
}