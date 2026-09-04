class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder(s);

        int idx;

        while ((idx = sb.indexOf("()")) != -1 ||
                (idx = sb.indexOf("{}")) != -1 ||
                (idx = sb.indexOf("[]")) != -1) {

            sb.delete(idx, idx + 2);
        }

        return sb.length() == 0;
    }
}