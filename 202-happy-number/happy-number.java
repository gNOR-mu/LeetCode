class Solution {
    public boolean isHappy(int n) {
        while (n>9) {
            int sum = 0;
            int n2 = n;
            while (n2 > 0) {
                int val = n2%10;
                sum += val*val;
                n2 /= 10;
            }
            n = sum;
        }

        return n==1 || n==7;
    }
}