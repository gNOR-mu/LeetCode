class Solution {
    public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle); //ez
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, needle.length() + i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}