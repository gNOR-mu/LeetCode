class Solution {
    public int[] getConcatenation(int[] nums) {
        // int length = nums.length;
        // int[] res = new int[length * 2];
        // for (int i = 0; i < nums.length; i++) {
        //     res[i] = nums[i];
        //     res[length++] = nums[i];
        // }
        // return res;
        int[] res = new int[nums.length * 2];
        System.arraycopy(nums, 0, res, 0, nums.length);
        System.arraycopy(nums, 0, res, nums.length, nums.length);
        return res;
    }
}