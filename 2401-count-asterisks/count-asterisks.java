class Solution {
    public int countAsterisks(String s) {
        int bars = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '|'){
                bars++;
            }
            if(c=='*'&& (bars&1)==0){
                count++;
            }
        }
        return count;
    }
}