class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        char[] decode = new char[26];
        char start = 'a';

        for (int i = 0; start <= 'z'; i++) {
            char c = key.charAt(i);
            if (c != ' ') {
                int val = c - 'a';
                if (decode[val] == '\0') {
                    decode[val] = start++;
                }
            }
        }

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c != ' ') {
                sb.append(decode[c - 'a']);
            } else {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}