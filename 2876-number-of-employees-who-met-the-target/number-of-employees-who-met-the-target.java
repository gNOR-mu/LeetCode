class Solution {
    //xD
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int response = 0;
        for (int h : hours) {
            if (h >= target)
                response++;
        }
        return response;
    }
}