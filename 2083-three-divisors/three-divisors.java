class Solution {
    public boolean isThree(int n) {
        int div = 1;
        for(int i=2;i<=n;i++){
            if(n%i==0 && ++div > 3){
                return false;
            }
        }
        return div == 3;
    }
}