class Solution {
    public int percentageLetter(String s, char letter) {
        int total = 0;
        for(char c:s.toCharArray()){
            if(c==letter){
                total++;
            }
        }
        return 100*total/s.length();
    }
}