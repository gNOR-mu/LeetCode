import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    public int lengthOfLastWord(String s) {
        Pattern pattern = Pattern.compile("\\b(\\w+)\\s*$");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            return matcher.group(1).length();
        }
        return 0;
    }
}