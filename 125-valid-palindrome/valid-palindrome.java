class Solution {
    public static boolean checkPolindrome(String s, int a, int b){
        if(a > b){
            return true;
        }
        if((Character.isLetterOrDigit(s.charAt(a))) && (Character.isLetterOrDigit(s.charAt(b)))){
            if(Character.toLowerCase(s.charAt(a)) != Character.toLowerCase(s.charAt(b))){
                return false;
            }
        } else  if(!(Character.isLetterOrDigit(s.charAt(a))) ){
                return checkPolindrome(s,a+1,b);
        } else if(!(Character.isLetterOrDigit(s.charAt(b)))){
                return checkPolindrome(s,a,b-1);
        } else {
            return checkPolindrome(s,a+1,b-1);
        }
        return checkPolindrome(s,a+1,b-1);
    }
    public boolean isPalindrome(String s) {
        return checkPolindrome(s,0,s.length()-1);













        // if(s.equals(" ")){
        //     return true;
        // }
        // int a = 0;
        // int b = s.length()-1;
        // while(a != b){

        //     if(!((s.charAt(a) < 'a' && s.charAt(a) > 'z') || (s.charAt(a) >= 'A' && s.charAt(a) <= 'Z'))){
        //         a++;
        //     } 
        //     if(!((s.charAt(b) < 'a' && s.charAt(b) > 'z') || (s.charAt(b) >= 'A' && s.charAt(b) <= 'Z'))){
        //         b--;
        //     } 
    
            
        //     if (Character.toLowerCase(s.charAt(a)) == Character.toLowerCase(s.charAt(b))) {
        //         a++;
        //         b--;
        //     } else {
        //         return false;
        //     }
            
        // }
        // return true;
    }
}