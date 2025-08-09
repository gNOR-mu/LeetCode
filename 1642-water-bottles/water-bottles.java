class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int n = numBottles;
        while (numBottles >= numExchange) {
            int div = numBottles / numExchange;
            n += div;
            numBottles = div + numBottles % numExchange;
        }
        return n;
    }
}