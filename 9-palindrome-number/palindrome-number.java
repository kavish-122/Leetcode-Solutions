class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int rev = 0;
        if(x == 0){
            return true;
        }
        if(x < 0){
            return false;
        }
        while(n != 0){
            int ld = n % 10;
            n /= 10;
            if(rev > Integer.MAX_VALUE/10){
                return false;
            }
            rev = (10*rev) + ld;
        }
        if(rev == x){
            return true;
        } else { 
            return false;
        }
    }
}