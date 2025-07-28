class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] solucion = new int[nums.length];
        int positivos = 0;
        int negativos = 1;
        for (int n : nums) {
            if (n >= 0) {
                solucion[positivos] = n;
                positivos += 2;
            } else {
                solucion[negativos] = n;
                negativos += 2;
            }
        }
        return solucion;
    }
}