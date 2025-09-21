class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int i=0;i<nums.length;i++){
            int val = map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],val);
        }
        
        for(int i=0;i<nums.length;i++){
            int val = map.get(nums[i]) -1 ;
            map.put(nums[i],val);
            if(val>0){
                res += val;
            }
        }
        return res;
    }
}