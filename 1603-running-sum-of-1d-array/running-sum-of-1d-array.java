class Solution {
    public int[] runningSum(int[] nums) {
        int[] sol = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sol[i] = i != 0 ? nums[i] + sol[i - 1] : nums[i];
        }
        return sol;
    }
}