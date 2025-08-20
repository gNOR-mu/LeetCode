class Solution {
    public static int firstMissingPositive(int[] nums) {
        int end = nums.length;
        //leet code cycle sort
        int i=0;
        while (i < end) {
            int correctIdx = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= end && nums[i] != nums[correctIdx]) {
                swap(nums, i, correctIdx);
            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
           if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return end+1;
    }
   private static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}