class Solution {
    public int compareVersion(String version1, String version2) {
        String[] sp1 = version1.split("\\.");
        String[] sp2 = version2.split("\\.");
        int max = Math.max(sp1.length, sp2.length);
        String[] nsp1 = new String[max];
        String[] nsp2 = new String[max];
        System.arraycopy(sp1, 0, nsp1, 0, sp1.length);
        System.arraycopy(sp2, 0, nsp2, 0, sp2.length);

        for (int i = sp1.length; i < nsp1.length; i++) {
            nsp1[i] = "0";
        }
        for (int i = sp2.length; i < nsp2.length; i++) {
            nsp2[i] = "0";
        }
        for (int i = 0; i < max; i++) {
            int val1 = Integer.valueOf(nsp1[i]);
            int val2 = Integer.valueOf(nsp2[i]);
            if (val1 > val2) {
                return 1;
            } else if (val1 < val2) {
                return -1;
            }
        }
        return 0;
    }
}