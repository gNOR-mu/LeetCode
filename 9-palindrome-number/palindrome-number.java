class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){return false;}
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        return sb.toString().equals(sb.reverse().toString());
    }
}