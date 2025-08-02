class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int zeros = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != 0) {
                total *= num;
            } else if (++zeros == 2) {
                break;
            }
        }
        if (zeros > 1 || nums.length == 1 && zeros == 1) {
            return new int[nums.length];
        }

        int[] product = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != 0) {
                if (zeros == 0) {
                    product[i] = total / num;
                } else {
                    product[i] = 0;
                }
            } else {
                product[i] = total;
            }
        }
        return product;
    }
}