class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length <2){
            return 0;
        }
        Arrays.sort(nums);
        int maxGap = 0;
        for(int i=0;i<nums.length-1;i++){
            int diff = Math.abs(nums[i]-nums[i+1]);
            if(diff > maxGap){
                maxGap = diff;
            }
        }
        return maxGap;
    }
}