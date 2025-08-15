class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Arrays.sort(nums);
        int repetido = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                if(++repetido>1){
                return false;
                }
            }else{
                repetido = 0;
            }
        }
        return true;
    }
}