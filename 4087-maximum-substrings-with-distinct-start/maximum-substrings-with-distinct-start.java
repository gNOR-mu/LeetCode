class Solution {
    public int maxDistinct(String s) {
        int res = 0;
        int[] freq = new int[26];

        for(char c: s.toCharArray()){

            if(freq[c - 'a']++ == 0 && ++res == 26){
                break;
            }
        }

        return res;
    }
}