class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int mitad = merged.length / 2;
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < merged.length; i++) {
            if (n1 >= nums1.length) {
                merged[i] = nums2[n2++];
            } else if (n2 >= nums2.length) {
                merged[i] = nums1[n1++];
            } else if (nums1[n1] <= nums2[n2]) {
                merged[i] = nums1[n1++];
            } else {
                merged[i] = nums2[n2++];
            }
        }
        if ((merged.length & 1) == 0) {
            return (merged[mitad] + merged[mitad - 1]) / 2.0;
        } else {
            return merged[mitad];
        }
    }
}