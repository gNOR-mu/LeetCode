class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int res = 0;
        for(char j:jewels.toCharArray()){
            set.add(j);
        }
        for(char s:stones.toCharArray()){
            if(set.contains(s)){
                res++;
            }
        }
        return res;
    }
}