class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // PriorityQueue<Character> pq = new PriorityQueue<>();
        // for(char c:letters){
        //     if(c>target){
        //         pq.offer(c);
        //     }
        // }
        // return pq.size()>0?pq.poll():letters[0];
        for(char c:letters){
            if(c>target){
                return c;
            }
        }

        return letters[0];
    }
}