class Solution {
    public int findCenter(int[][] edges) {
        int[] f = new int[edges.length + 2];
        int max = 0;
        int idx =0;
        for (int i = 0; i < edges.length; i++) {
            f[edges[i][0]]++;
            f[edges[i][1]]++;
        }
        for (int i = 0; i < f.length; i++) {
            if(f[i] >max){
                max = f[i];
                idx = i;
            }
        }
        return idx;
    }
}