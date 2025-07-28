import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ' ' && length>0) {
                break;
            }
            if (c != ' ') {
                length++;
            }
        }
        return length;
    }
}