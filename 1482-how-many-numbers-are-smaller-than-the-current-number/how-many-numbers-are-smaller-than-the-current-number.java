class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                int less = 0;
                for (int k = 0; k < nums.length; k++) {
                    if (nums[k] < nums[i]) {
                        less++;
                    }
                }
                map.put(nums[i], less);
            }
            res[i] = map.get(nums[i]);
        }

        return res;
    }
}