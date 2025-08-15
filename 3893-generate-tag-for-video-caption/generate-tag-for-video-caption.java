class Solution {
    public String generateTag(String caption) {
        caption = caption.trim().toLowerCase();
        if (caption.isEmpty()) {
            return "#";
        }
        StringBuilder sb = new StringBuilder("#");
        sb.append(caption.charAt(0));
        for (int i = 1; i < caption.length(); i++) {
            char c = caption.charAt(i);
            if (c == ' ') {
                continue;
            } else if (caption.charAt(i - 1) == ' ') {
                c = Character.toUpperCase(c);
            }
            sb.append(c);
        }
        if (sb.length() > 100) {
            return sb.substring(0, 100);
        }
        return sb.toString();
    }
}