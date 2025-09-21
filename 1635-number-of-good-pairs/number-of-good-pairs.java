class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int i=0;i<nums.length;i++){
            int val = map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],val);
        }

        for(Integer val:map.values()){
            res += ((val-1)*(val))/2;
        }
        return res;
        /*
        1: 3
            1.  2
            2.  1
        2:1
        3:2
        */
    }
}