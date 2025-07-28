class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
 int[] solucion = new int[nums.length];
        int[] iguales = new int[nums.length];
        int[] mayores = new int[nums.length];
        int nMenores = 0;
        int nMayores = 0;
        int nIguales = 0;
        for (int n : nums) {
            if (n < pivot) {
                solucion[nMenores++] = n;
            } else if (n == pivot) {
                iguales[nIguales++] = n;
            } else {
                mayores[nMayores++] = n;
            }
        }
        System.arraycopy(iguales, 0, solucion, nMenores, nIguales);
        System.arraycopy(mayores, 0, solucion, nMenores + nIguales, nMayores);

        return solucion;
    }
}