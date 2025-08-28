class Solution {
    public int missingNumber(int[] nums) {
        boolean[] m = new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            m[nums[i]] = true;
        }
        for(int i=0;i<m.length;i++){
            if(!m[i]){
                return i;
            }
        }
        return nums.length;
    }
}