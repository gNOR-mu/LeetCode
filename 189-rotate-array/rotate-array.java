class Solution {
    public void rotate(int[] nums, int k) {
        // int rotate = k%nums.length;
        // int[] aux = new int[nums.length];
        // System.arraycopy(nums, 0, aux, rotate, nums.length - rotate);
        // System.arraycopy(nums, nums.length - rotate, aux, 0, rotate);
        // System.arraycopy(aux, 0, nums, 0, nums.length);
        if(k>nums.length) k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;end--;
        }
    }
}