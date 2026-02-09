class Solution {
    public int numberOfBeams(String[] bank) {
      if (bank.length == 0) {
            return 0;
        }

        int res = 0;
        long actual = countDevices(bank[0]);
        long next = 0;

        for (int i = 1; i < bank.length; i++) {
            next = countDevices(bank[i]);
            if (next > 0) {
                res += actual * next;
                actual = next;
            }
        }
        return res;
    }

    public long countDevices(String line) {
        return line.chars().filter(c -> c == '1').count();
    }
}