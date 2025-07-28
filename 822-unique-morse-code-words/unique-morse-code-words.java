class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        final String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--",
                "-..-", "-.--", "--.." };
        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                sb.append(morse[word.charAt(i) - 'a']);
            }
            uniqueWords.add(sb.toString());
        }
        return uniqueWords.size();

    }
}