class Solution {
    public long dividePlayers(int[] skill) {
       Arrays.sort(skill);
        long res = 0;
        int end = skill.length - 1;
        int avg = skill[0] + skill[end];
        int mid =skill.length / 2;
        for (int i = 0; i < mid; i++) {
            int actual = skill[i];
            int par = skill[end];
            end--;
            if (avg != actual + par) {
                return -1;
            }
            res += actual * par;
        }
        return res;
    }
}