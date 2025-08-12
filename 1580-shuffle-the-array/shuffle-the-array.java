class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] s = new int[nums.length];
        int idx = 0;
        for(int i=0;i<n;i++){
            s[idx++] = nums[i];
            s[idx++] =nums[i+n];
        }
        return s;
    }
}