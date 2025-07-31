class Solution {
    public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle); //ez
        int end = haystack.length() - needle.length();
        for (int i = 0; i <= end; i++) {
            if (haystack.substring(i, needle.length() + i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}