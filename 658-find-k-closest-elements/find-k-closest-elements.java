class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (k > 0) {
                pq.offer(val);
                k--;
            } else if (Math.abs(pq.peek() - x) > Math.abs(val - x)) {
                pq.poll();
                pq.offer(val);
            }
        }
        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }
        return list;
    }
}