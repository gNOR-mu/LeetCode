class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long res = 0;
        int avg = 0;
        int mid = skill.length / 2;
        for (int i = 0; i < mid; i++) {
            int actual = skill[i];
            int par = skill[skill.length - 1 - i];
            int avgTeam = actual + par;
            if (avg != 0 && avg != avgTeam) {
                return -1;
            } else {
                avg = avgTeam;
            }
            res += actual * par;
        }
        return res;
    }
}