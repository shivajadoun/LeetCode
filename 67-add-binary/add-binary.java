class Solution {
    public String addBinary(String a, String b) {
         int al=a.length()-1;
         int bl=b.length()-1;
        String ans="";
        int c=0;
         while(al>=0 && bl>=0){
         int p=(a.charAt(al)-'0')+(b.charAt(bl)-'0')+c;
         if(p>1)c=1;
         else c=0;
         if(p==2 || p==0){
            ans+='0';
         }else{
            ans+='1';
         }
         al--;
         bl--;
         System.out.print(c+" ");
         }
         if(al>=0){
            while(al>=0){
                int p=a.charAt(al)-'0'+c;
                if(p>1)c=1;
                else c=0;
                if(p==2 ||p==0)ans+='0';
                else ans+='1';
                al--;
  System.out.print(c+" ");
            }
         }
            if(bl>=0){
                while(bl>=0){
                      int p=b.charAt(bl)-'0'+c;
                if(p>1)c=1;
                else c=0;
                if(p==2 ||p==0)ans+='0';
                else ans+='1';
                bl--;
                  System.out.print(c+" ");
                }
            }
            if(c==1)ans+='1';
              System.out.print(c+" ");
            String ans2="";
            for(int i=ans.length()-1;i>=0;i--){
                ans2+=ans.charAt(i);
            }
            return ans2;

         
    }
}