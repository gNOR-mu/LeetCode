class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        return sb.toString().equals(sb.reverse().toString());
    }
}