class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
 int[] solucion = new int[A.length];
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        int comunes = 0;
        for (int i = 0; i < A.length; i++) {
            if (!a.contains(A[i])) {
                a.add(A[i]);
            }
            if (!b.contains(B[i])) {
                b.add(B[i]);
            }
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