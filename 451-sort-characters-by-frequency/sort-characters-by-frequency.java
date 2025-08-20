class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> hm = new HashMap<>();
        Comparator<Map.Entry<Character, Integer>> comp = (a, b) -> b.getValue().compareTo(a.getValue());
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(comp);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        pq.addAll(hm.entrySet());
        while (!pq.isEmpty()) {
            var tmp = pq.poll();
            String st = String.valueOf(tmp.getKey()).repeat(tmp.getValue());
            sb.append(st);
        }
        return sb.toString();
    }
}