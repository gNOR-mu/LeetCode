class Solution {
    public int[] constructRectangle(int area) {
        if(area < 4){
            return new int[]{area,1};
        }
        int res[] = new int[2];
        int sqrt = (int)Math.sqrt(area);
        for(int i=sqrt;i>0;i--){
            if(area%i==0){
                res[0] = area/i;
                res[1] = i;
                break;
            }
        }
        return res;
    }
}