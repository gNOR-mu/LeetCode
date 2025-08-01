class Solution {
    public void rotate(int[] nums, int k) {
        int rotate = k%nums.length;
        int[] aux = new int[nums.length];
        System.arraycopy(nums, 0, aux, rotate, nums.length - rotate);
        System.arraycopy(nums, nums.length - rotate, aux, 0, rotate);
        System.arraycopy(aux, 0, nums, 0, nums.length);
    }
}