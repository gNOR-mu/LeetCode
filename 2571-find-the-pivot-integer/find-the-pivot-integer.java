class Solution {
    public int pivotInteger(int n) {
        int total = n * (n + 1) / 2;
        // for (int x = 1; x <= n; x++) {
        //     int leftSum = x * (x + 1) / 2;
        //     int rightSum = total - (x - 1) * x / 2;
        //     if (leftSum == rightSum) {
        //         return x;
        //     }
        // }

        int sqrt = (int) Math.sqrt(total); 
        if (Math.pow(sqrt,2) == total) {
            return sqrt;
        }
        return -1;
    }
}