class Solution {
    public static boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long m2 = (long) mid * mid;
            if (m2 == num) {
                return true;
            } else if (m2 < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}