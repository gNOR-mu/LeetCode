class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] solucion = new int[A.length];
        Map<Integer, Integer> a = new HashMap<>();
        Map<Integer, Integer> b = new HashMap<>();

        int comunes = 0;
        for (int i = 0; i < A.length; i++) {
            a.put(A[i], a.containsKey(A[i]) ? a.get(A[i]) : A[i]);
            b.put(B[i], b.containsKey(B[i]) ? b.get(B[i]) : B[i]);

            if (a.containsKey(B[i])) {
                comunes++;
            }
            if (b.containsKey(A[i]) && A[i] != B[i]) {
                comunes++;
            }
            solucion[i] = comunes;
        }
        return solucion;
    }
}