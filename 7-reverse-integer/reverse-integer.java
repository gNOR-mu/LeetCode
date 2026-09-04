class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE / 10;
        int min = Integer.MIN_VALUE / 10;
        int res = 0;

        while (x != 0) {
            if(res > max || res < min){
                return 0; 
            }
            res *= 10;
            res += x % 10;
            x /= 10;
            
        }

        return res;
    }
}