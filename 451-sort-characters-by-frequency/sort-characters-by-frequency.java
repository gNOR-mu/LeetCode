class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> tm = new TreeMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            tm.put(c, tm.getOrDefault(c, 0) + 1);
        }
        var al = new ArrayList<>(tm.entrySet());
        al.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        for (Map.Entry<Character, Integer> e : al) {
            sb.append(String.valueOf(e.getKey()).repeat(e.getValue()));
        }
        return sb.toString();
    }
}