class Solution{
    public int countDigits(long m){
        int count = 0;
        while(m != 0){
            m = m/10;
            count++;
        }
        return count;
    }
    public long power(long x, long y) {
        long MOD = 1000000007;
        long result = 1;

        while(y > 0) {
            if(y % 2 == 1) {
                result = (result * x) % MOD;
            }

            x = (x * x) % MOD;
            y = y / 2;
        }

    return result;
    }
    public int sumDecoded(long[] nums) { 
        long MOD = 1000000007;
        long sum = 0; 
        for(int i=0; i<nums.length; i++){ 
            int width = (int)(nums[i] % 10);
            long d = nums[i] / 10;

            int count = countDigits(d);

            int k = 1;
            int yDigits = count - width;

            for(int j = 0; j < yDigits; j++) {
                k *= 10;
            }

            long y = d % k;
            long x = d / k;
            sum = (sum+power(x,y))%MOD;

        } 
        return (int)sum; 
    } 
} 