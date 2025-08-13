class Solution {
    public int maxFreqSum(String s) {
        int[] dictFrec = new int[26];
        int maxVowel = 0;
        int maxConsonant = 0;
        for (int i = 0; i < s.length(); i++) {
            dictFrec[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            //vocales 'a'-'a','b'-'a'... etc
            if (i == 0 || i == 4 || i == 8 || i == 14 || i == 20) {
                if (dictFrec[i] > maxVowel) {
                    maxVowel = dictFrec[i];
                }
            } else if (dictFrec[i] > maxConsonant) {
                maxConsonant = dictFrec[i];
            }
        }
        return maxConsonant + maxVowel;
    }

}