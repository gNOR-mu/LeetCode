class Solution {
    public int countAsterisks(String s) {
        boolean validBar = true;;
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '|'){
                validBar = !validBar;
            }else if(c=='*'&& validBar){
                count++;
            }
        }
        return count;
    }
}