class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] sol = new int[length];
        int sum=0;
        for(int i=0;i<length;i++){
            sol[i]=i!=0?nums[i]+sol[i-1]:nums[i];
        }
        return sol;
    }
}