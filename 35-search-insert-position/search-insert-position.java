class Solution {
    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                return i;
            }
        }

        return i;
    }
}