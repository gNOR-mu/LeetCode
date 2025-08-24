class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int diffA = Math.abs(x - a);
            int diffB = Math.abs(x - b);
            if (diffA == diffB) {
                return b - a;
            }
            return diffB - diffA;
        });
        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        for (int i = 0; i < k; i++) {
            list.add(pq.poll());
        }
        Collections.sort(list);
        return list;
    }
}