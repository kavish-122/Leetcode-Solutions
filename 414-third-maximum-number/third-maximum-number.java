class Solution {
    public int thirdMax(int[] nums) {

        long fm = Long.MIN_VALUE;
        long sm = Long.MIN_VALUE;
        long tm = Long.MIN_VALUE;

        for (int num : nums) {

            if (num == fm || num == sm || num == tm) {
                continue;
            }

            if (num > fm) {
                tm = sm;
                sm = fm;
                fm = num;
            } 
            else if (num > sm) {
                tm = sm;
                sm = num;
            } 
            else if (num > tm) {
                tm = num;
            }
        }
        if (tm == Long.MIN_VALUE) {
            return (int) fm;
        }

        return (int) tm;
    }
}