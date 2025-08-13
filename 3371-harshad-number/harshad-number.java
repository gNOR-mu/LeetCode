class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n2 = x;
        int x2 =0;
        while(n2>0){
            x2+=n2%10;
            n2/=10;
        }
        return x%x2 == 0?x2:-1;
    }
}