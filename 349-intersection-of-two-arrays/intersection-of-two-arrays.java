class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        set.retainAll(Arrays.stream(nums2).boxed().collect(Collectors.toSet()));
        return set.stream().mapToInt(Number::intValue).toArray();
    }
}