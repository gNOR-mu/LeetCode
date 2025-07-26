class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).toArray();
        int[] sorted = Arrays.stream(merged).sorted().toArray();
        int largo = sorted.length;
        for (int i = 0; i < largo; i++) {
            System.out.print(sorted[i] + " ");
        }
        if ((largo & 1) == 0) {
            int mitad = largo / 2;
            return ((sorted[mitad] + sorted[mitad - 1]) / 2.0);
        } else {
            return Double.valueOf(sorted[Math.ceilDiv(largo, 2) - 1]);
        }
    }
}