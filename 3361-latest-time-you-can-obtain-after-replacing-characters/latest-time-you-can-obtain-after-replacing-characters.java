class Solution {
    public String findLatestTime(String s) {
         char h1=s.charAt(0);
         char h2=s.charAt(1);
         char m1=s.charAt(3);
         char m2=s.charAt(4);
         if(h1=='?'&&h2=='?'){
            h1='1';
            h2='1';
         }else if(h1=='?'){
            if(h2-'0'>1)h1='0';
            else h1='1';
         }else if(h2=='?'){
            if(h1=='0')h2='9';
            else h2='1';
         }

         
          if(m1=='?'&&m2=='?'){
            m1='5';
            m2='9';
         }else if(m1=='?'){
            m1='5';
         }else if(m2=='?'){
            m2='9';
         }
         String ans="";
         ans+=h1;
         ans+=h2;
         ans+=':';
         ans+=m1;
         ans+=m2;
         return ans;
    
    }
}