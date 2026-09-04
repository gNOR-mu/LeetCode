class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        int prevLength;

        do {
            prevLength = s.length();
            s = s.replace("()", "")
                    .replace("{}", "")
                    .replace("[]", "");
        } while (s.length() < prevLength);

        return s.isEmpty();
    }
}