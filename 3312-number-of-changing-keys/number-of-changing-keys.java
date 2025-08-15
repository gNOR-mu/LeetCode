class Solution {
    public int countKeyChanges(String s) {
        int c =0;
        for(int i=0;i<s.length()-1;i++){
            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(i+1));
            if(a!=b){
                c++;
            }
        }
        return c;
    }
}