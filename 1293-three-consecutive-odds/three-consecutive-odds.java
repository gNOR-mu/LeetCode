class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] & 1) == 0
                    || (arr[++i] & 1) == 0
                    || (arr[++i] & 1) == 0) {
                continue;
            }
            return true;
        }
        return false;
    }
}