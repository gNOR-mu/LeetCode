class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] == nums[i + 1]) {
        //         return true;
        //     }
        // }
        // return false;
        Set<Integer> nums2 = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!nums2.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}