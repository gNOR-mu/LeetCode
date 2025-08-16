class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] res = new int[length * 2];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
            res[length++] = nums[i];
        }
        return res;
    }
}