class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        int eq = 0;
        while (left <= right) {
            if (nums[right] == val) {
                right--;
                eq++;
                continue;
            }
            if (nums[left] == val) {
                int tmp = nums[right];
                nums[right] = nums[left];
                nums[left] = tmp;
            }
            left++;
        }
        return nums.length - eq;
    }
}