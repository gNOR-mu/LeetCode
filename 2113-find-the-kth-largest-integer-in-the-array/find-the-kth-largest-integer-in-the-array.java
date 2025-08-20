import java.math.BigInteger;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Comparator<String> comp = (a, b) -> {
            if (a.length() != b.length()) {
                return b.length() - a.length();
            }
            return b.compareTo(a);
        };        PriorityQueue<String> pq = new PriorityQueue<>(comp);
               // PriorityQueue<String> pq = new PriorityQueue<>(comp);
        // for (int i = 0; i < nums.length; i++) {
        // pq.add(nums[i]);
        // }
        // for (int i = 1; i < k; i++) {
        // pq.poll();
        // }
        // return pq.peek();
        Arrays.sort(nums, comp);
        return nums[k - 1];
    }
}