class Solution {
    public int romanToInt(String s) {
        int num = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        Map<String, Integer> comp = new HashMap();
        comp.put("IV", 4);
        comp.put("IX", 9);
        comp.put("XL", 40);
        comp.put("XC", 90);
        comp.put("CD", 400);
        comp.put("CM", 900);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int val = 0;
            if ((c == 'I' || c == 'X' || c == 'C') && i < s.length() - 1) {
                String s2 = "" + c + s.charAt(i + 1);
                if (comp.containsKey(s2)) {
                    num += comp.get(s2);
                    i++;
                    continue;
                }
            }
            num += map.get(c);

        }
        return num;
    }
}