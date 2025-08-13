class Solution {
    public int countAsterisks(String s) {
        boolean validBar = true;;
        int count = 0;
        for(char c:s.toCharArray()){
            if(c == '|'){
                validBar = !validBar;
            }else if(c=='*'&& validBar){
                count++;
            }
        }
        return count;
    }
}