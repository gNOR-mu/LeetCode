class Solution {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        int carry = 0;
                digits[index] += 1;
        do {
            int num = digits[index] +  carry;
            carry = num / 10;
            num = num < 10 ? num : num - 10;
            digits[index--] = num;
        } while (carry != 0 && index >= 0);
        if (carry == 0) {
            return digits;
        }
        int[] res = new int[digits.length + 1];
        res[0] = carry;
        System.arraycopy(digits, 0, res, 1, digits.length);
        return res;
    }
}