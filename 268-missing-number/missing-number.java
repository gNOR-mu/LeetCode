class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int sum = 0;
        int total = l*(l+1)/2;
        for(int i=0;i<l;i++){
            sum += nums[i];
        }
        if(sum==total){
            return 0;
        }
        return total-sum;
    }
}