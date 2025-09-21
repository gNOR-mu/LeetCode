class Solution {
    public int[] transformArray(int[] nums) {
        int[] res = new int[nums.length];
        int odds = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & 1) == 1) {
                odds += 1;
            }
        }
        for (int i = nums.length - odds; i < nums.length; i++) {
            res[i] = 1;
        }
        return res;
    }
}