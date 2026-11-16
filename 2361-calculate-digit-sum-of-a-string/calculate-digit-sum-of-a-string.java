class Solution {
    public String solve(String s, int k){
        if(s.length() <= k){
            return s;
        }
        String s1 = "";
        for(int i=0; i<s.length(); i=i+k){
            int sum = 0;
            for(int m=i; m<i+k; m++){
                if(m >= s.length()){
                    break;
                }
                char ch = s.charAt(m);
                int num = Integer.parseInt(String.valueOf(ch));
                sum += num;
            }
            String str = Integer.toString(sum);
            s1 = s1.concat(str);
        }
        return solve(s1,k);
    }
    public String digitSum(String s, int k) {
        return solve(s,k);
    }
}