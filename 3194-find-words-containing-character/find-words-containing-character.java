class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        String x2 = String.valueOf(x);
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(x2)) {
                res.add(i);
            }
        }
        return res;
    }
}