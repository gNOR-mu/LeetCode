class Solution {
    public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle); //ez
        int s1l = haystack.length();
        for (int i = 0; i < s1l; i++) {
            for (int j = 0; j < needle.length() && i + j < s1l; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}