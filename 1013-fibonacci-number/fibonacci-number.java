class Solution {
    public int Rfib(int n){
        if(n<=1){
            return n;
        }
        int last = Rfib(n-1);
        int secondLast = Rfib(n-2);
        return last+secondLast;
    }
    public int fib(int n) {
        return Rfib(n);
    }
}