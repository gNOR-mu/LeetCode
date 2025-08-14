class Solution {
    public int minDeletion(String s, int k) {
        int[] cmap = new int[26];
        int total = 0;
        for (char c : s.toCharArray()) {
            cmap[c - 'a']++;
        }
        Arrays.sort(cmap);
        for (int i = 25 - k; i >= 0; i--) {
            total += cmap[i];
        }
        return total;
    }
}