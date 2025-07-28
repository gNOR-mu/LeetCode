class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] solucion = new int[A.length];
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        int comunes = 0;
        for (int i = 0; i < A.length; i++) {
            a.add(A[i]);
            b.add(B[i]);
            if (a.contains(B[i])) {
                comunes++;
            }
            if (b.contains(A[i]) && A[i] != B[i]) {
                comunes++;
            }
            solucion[i] = comunes;
        }
        return solucion;
    }
}