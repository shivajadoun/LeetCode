class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)return 0;
         int i=0;
         int sign=1;
         if(s.charAt(i)=='-' ||s.charAt(i)=='+'){
            sign =s.charAt(i)=='-'?-1:1;
            i++;
         }
         
         long res=0;
         while(i<s.length()&&(s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9)){
            
                // System.out.println(res);
                res=res*10+(s.charAt(i)-'0');
                if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE){
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                i++;
         }
         return (int)res*sign;
    }
}