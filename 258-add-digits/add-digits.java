class Solution {
    public int add(int num){
        if(num < 10){
            return num;
        }
        int sum = 0;
        while(num != 0){
            int r = num % 10;
            sum += r;
            num = num/10;
        }
        int k = add(sum);
        return k;
    }
    public int addDigits(int num) {
        if(num < 10){
            return num;
        }
        int sum = add(num);
        return sum;
    }
}