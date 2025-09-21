class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int i=0;i<nums.length;i++){
            map.compute(nums[i], (_, v) -> (v != null) ? v + 1 : 1);
        }

        for(Integer val:map.values()){
            res += ((val-1)*(val))/2;
        }
        return res;
    }
}