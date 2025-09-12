class Solution {
    public String countAndSay(int n) {
        StringBuilder rle = new StringBuilder("1");
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char start = rle.charAt(0);
            for (int j = 1; j < rle.length(); j++) {
                char c = rle.charAt(j);
                if (c == start) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(start);
                    start = c;
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(start);
            rle = sb;
        }
        return rle.toString();
    }
}