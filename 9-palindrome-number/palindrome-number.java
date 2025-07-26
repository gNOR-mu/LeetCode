class Solution {
    public boolean isPalindrome(int x) {
        // los negativos no son palíndromos
        if (x < 0) {
            return false;
        }

        int copia = x;
        int reverso = 0;

        while (x > 0) {
            reverso = (reverso * 10) + (x % 10);
            x /= 10;
        }

        return reverso == copia;
    }
}