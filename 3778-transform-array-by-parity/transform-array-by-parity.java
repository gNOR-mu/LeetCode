class Solution {
    public int[] transformArray(int[] nums) {
        int[] res = new int[nums.length];
        int idx = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & 1) == 1) {
                res[idx--] = 1;
            }
        }
        return res;
    }
}