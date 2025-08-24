class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        for(char s:stones.toCharArray()){
            if(jewels.indexOf(s)!=-1){
                res++;
            }
        }
        return res;
    }
}