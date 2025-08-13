class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allow = new boolean[26];
        int consistent =0;
        for (int i = 0; i < allowed.length(); i++) {
            char c = allowed.charAt(i);
            allow[c - 'a'] = true;
        }

        for (int i = 0; i < words.length; i++) {
            consistent++;
            for (int j = 0; j < words[i].length(); j++) {
                if (!allow[words[i].charAt(j) - 'a']) {
                    consistent--;
                    break;
                }
            }
        }
        return consistent;
    }
}