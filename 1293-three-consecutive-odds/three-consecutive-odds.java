class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] & 1) == 0) {
                continue;
            } else if ((arr[i + 1] & 1) == 0) {
                i += 1;
                continue;
            } else if ((arr[i + 2] & 1) == 0) {
                i += 2;
                continue;
            } else {
                return true;
            }
        }
        return false;
    }
}