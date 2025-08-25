class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // PriorityQueue<Character> pq = new PriorityQueue<>();
        // for(char c:letters){
        //     if(c>target){
        //         pq.offer(c);
        //     }
        // }
        // return pq.size()>0?pq.poll():letters[0];
        boolean[] dict = new boolean[26];
        for(char c:letters){
            if(c>target){
                dict[c-'a'] = true;
            }
        }
        for(int i=target-'a' +1;i<26;i++){
            if(dict[i]){
                return (char)(i+'a');
            }
        }
        return letters[0];
    }
}