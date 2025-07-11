class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<1||s==null) return " ";
        int st =0,end =0;
        for(int i=0;i<s.length();i++){
            int odd_len = expandCenter(s,i,i);
            int even_len = expandCenter(s,i,i+1);
            int over_len = Math.max(odd_len,even_len);
            if(over_len>end-st){
                st = i-((over_len-1)/2);
                end = i+(over_len/2);
            }
        }
        return s.substring(st,end+1);
    }
    public static int expandCenter(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(right)==s.charAt(left)){
            left--;
            right++;
        }
        return right-left-1;
    }
} 