class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();

        int i = num.length - 1;
        int carry = 0;

        while (i >= 0 || k > 0 || carry > 0) {
            int digit = 0;

            if (i >= 0) {
                digit += num[i];
                i--;
            }

            if (k > 0) {
                digit += k % 10;
                k /= 10;
            }

            digit += carry;

            list.add(digit % 10);
            carry = digit / 10;
        }

        Collections.reverse(list);
        return list;
    }
}