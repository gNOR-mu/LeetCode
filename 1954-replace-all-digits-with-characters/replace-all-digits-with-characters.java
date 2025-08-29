class Solution {
    public String replaceDigits(String s) {
        if(s.length()==1){
            return s;
        }
        char anterior = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(anterior);
        for(int i=1;i<s.length();i++){
            char c= s.charAt(i);
            if((i&1)==1){
                c = (char)(anterior + c-'0');
            }
            anterior = c;
            sb.append(c);
        }
        return sb.toString();
    }
}