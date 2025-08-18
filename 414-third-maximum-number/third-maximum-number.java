class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int d = 2;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1] && --d == 0) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}