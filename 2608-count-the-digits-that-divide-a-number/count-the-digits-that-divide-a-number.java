class Solution {
    public int countDigits(int num) {
        int d = 0;
        int n2 = num;
        while (n2 > 0) {
            int tmp = n2 % 10;
            n2 /= 10;
            if (num % tmp == 0) {
                d++;
            }
        }
        return d;
    }
}