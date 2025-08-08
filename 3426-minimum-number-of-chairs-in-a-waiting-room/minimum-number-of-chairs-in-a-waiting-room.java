class Solution {
    public int minimumChairs(String s) {
        int max = 0;
        int ocupadas = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'E'){
                ocupadas++;
            }else{
                ocupadas--;
            }
            if(ocupadas >max){
                max = ocupadas;
            }
        }
        return max;
    }
}