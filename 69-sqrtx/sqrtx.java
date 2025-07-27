class Solution {
    public int mySqrt(int x) {
             int l = 1;
        int r = x;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            if (mid > x / mid)
                r = mid - 1;
            else if (mid < x / mid)
                l = mid + 1;
            else
                return mid;
        }
        return r;
    }
}