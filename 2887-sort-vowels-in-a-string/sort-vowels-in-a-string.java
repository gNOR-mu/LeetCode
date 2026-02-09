class Solution {
    public String sortVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        Queue<Character> queue = new PriorityQueue<>();

        for (char ch : s.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                queue.offer(ch);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                sb.replace(i, i + 1, "" + queue.poll());
            }
        }
        return sb.toString();
    }
}