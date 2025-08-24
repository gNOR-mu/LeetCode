class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length - k];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }
        for(int i=1;i<k;i++){
            pq.poll();
        }
        return pq.peek();
    }
}