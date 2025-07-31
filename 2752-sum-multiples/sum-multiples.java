class Solution {
    public static int sumOfMultiples(int n) {
        boolean[] c = new boolean[n + 1];

        for (int i = 3; i <= n; i += 3) {
            c[i] = true;
        }
        for (int i = 5; i <= n; i += 5) {
            c[i] = true;
        }
        for (int i = 7; i <= n; i += 7) {
            c[i] = true;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (c[i]) {
                sum += i;

            }
        }
        return sum;
    }
}