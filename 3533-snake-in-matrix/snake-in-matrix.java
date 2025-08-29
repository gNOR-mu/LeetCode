class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int v = 0;
        int h = 0;
        for(var s:commands){
            switch(s){
                case "DOWN"-> v++;
                case "UP"-> v--;
                case "LEFT"-> h--;
                case "RIGHT"-> h++;
            }
        }
        return v*n + h;
    }
}