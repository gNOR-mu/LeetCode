class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> c = new HashSet<>();
        int consistent = 0;
        for (int i = 0; i < allowed.length(); i++) {
            c.add(allowed.charAt(i));
        }

        for (int i = 0; i < words.length; i++) {
            boolean isConsistent = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!c.contains(words[i].charAt(j))) {
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent){
            consistent++;
            }
        }
        return consistent;
    }
}