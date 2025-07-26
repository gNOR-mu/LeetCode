class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE; // overflow
        boolean resultadoNegativo = (dividend < 0) ^ (divisor < 0);
        int dividendoL = dividend;
        int divisorL = divisor;
        if (dividendoL > 0)
            dividendoL = -dividendoL;
        if (divisorL > 0)
            divisorL = -divisorL;
        int cociente = 0;
        while (dividendoL <= divisorL) {
            int temp = divisorL;
            int multiple = 1;
            while (dividendoL - temp <= temp && temp >= (Integer.MIN_VALUE >> 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dividendoL -= temp;
            cociente += multiple;
        }
        return resultadoNegativo ? -cociente : cociente;
    }
}