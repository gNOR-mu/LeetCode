class Solution {
    public int[] transformArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if ((nums[left] & 1) == 0) {
                nums[left++] = 0;
            } else if ((nums[right] & 1) == 1) {
                nums[right--] = 1;
            } else {
                nums[left++] = 0;
                nums[right--] = 1;
            }

        }
        return nums;
    }
}