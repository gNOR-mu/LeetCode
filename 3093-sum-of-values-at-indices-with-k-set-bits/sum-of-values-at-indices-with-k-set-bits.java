class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            String bs = Integer.toBinaryString(i);
            int kBits = 0;
            for (char c : bs.toCharArray()) {
                if (c == '1') {
                    kBits++;
                }
            }

            if (kBits == k) {
                sum += nums.get(i);
            }
        }

        return sum;
    }
}