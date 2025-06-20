class Solution {
    public int maxDistance(String s, int k) {
        int max=0;
        int E=0;
        int W=0;
        int N=0;
        int S=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E')E++;
           else if(s.charAt(i)=='W')W++;
           else if(s.charAt(i)=='N')N++;
         else if(s.charAt(i)=='S')S++;
          int curr=Math.abs(E-W)+Math.abs(N-S);
          int total=i+1;
          int extra=total-curr;
          int extrac=0;
        
              extrac=Math.min(2*k,extra);
            
        
          int finalMd=curr+extrac;
          max=Math.max(finalMd,max);
        }
        return max;
    }
}