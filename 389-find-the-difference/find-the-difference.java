class Solution {
    public char findTheDifference(String s, String t) {
        // int a = 0;
        // int b = 0;
        // for (char c : s.toCharArray()) {
        //     a += c;
        // }
        // for (char c : t.toCharArray()) {
        //     b += c;
        // }
        // return s.length() > t.length() ? (char) (a - b) : (char) (b - a);
        char res = 0;
        for (char c : s.toCharArray()) {
            res ^=(char)c;
        }
        for (char c : t.toCharArray()) {
            res ^=(char)c;
        }
        return res;
    }
}