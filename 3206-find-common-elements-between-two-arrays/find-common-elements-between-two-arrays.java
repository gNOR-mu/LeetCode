class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] f1 = new int[101];
        int[] f2 = new int[101];
        int[] res = new int[2];
        for (int i = 0; i < nums1.length; i++) {
            f1[nums1[i]]++;
        }
        for (int i = 0; i < nums2.length; i++) {
            f2[nums2[i]]++;
        }
        for (int i = 0; i < 101; i++) {
            if (f1[i] > 0 && f2[i]>0) {
                res[0] +=f1[i];
                res[1] +=f2[i];
            }
        }
        return res;
    }
}