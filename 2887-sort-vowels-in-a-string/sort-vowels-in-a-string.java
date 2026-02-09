class Solution {
    public String sortVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                list.add(ch);
            }
        }
        Collections.sort(list);

        int idx = 0;
        for (char ch : s.toCharArray()) {
            sb.append(vowels.indexOf(ch) != -1 ? list.get(idx++) : ch);
        }

        return sb.toString();
    }
}