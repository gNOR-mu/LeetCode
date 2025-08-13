class Solution {
    public int tribonacci(int n) {
        int[] nums = { 0, 1, 1,0 };
        for (int i = 0; i < n; i++) {
            nums[3] = nums[0] + nums[1]+nums[2];
            nums[0] = nums[1];
            nums[1] = nums[2];
            nums[2] = nums[3];
        }
        return nums[0];
    }
}