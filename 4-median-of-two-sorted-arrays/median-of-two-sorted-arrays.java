class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int mitad = merged.length / 2;
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        if ((merged.length & 1) == 0) {
            return (merged[mitad] + merged[mitad - 1]) / 2.0;
        } else {
            return merged[mitad];
        }
    }
}