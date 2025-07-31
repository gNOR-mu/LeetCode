class Solution {
    public static int sumOfMultiples(int n) {
        return sumDiv(n, 3) + sumDiv(n, 5) + sumDiv(n, 7)
                - sumDiv(n, 15) - sumDiv(n, 21) - sumDiv(n, 35)
                + sumDiv(n, 105);
    }

    // Suma de múltiplos de k hasta n
    private static int sumDiv(int n, int k) {
        int m = n / k;
        return k * m * (m + 1) / 2;
    }
}