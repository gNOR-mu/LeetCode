class Solution {
    public int divide(int dividend, int divisor) {
     if (dividend == 0) return 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE; // overflow
        boolean resultadoNegativo = (dividend < 0) ^ (divisor < 0);
        long dividendoL = Math.abs((long)dividend);
        long divisorL = Math.abs((long)divisor);
        int cociente = 0;
        if(divisor==1) return resultadoNegativo?(int)~(dividendoL-1):dividend;
        while (dividendoL >= divisorL) {
            dividendoL -= divisorL;
            cociente++;
        }
        return resultadoNegativo ? -cociente : cociente;
    }
}