class Solution {
    public boolean canPlaceFlowers(int[] fl, int n) {
       int l=fl.length;
       if(n==0)return true;
       for(int i=0;i<l;i++){
        if(fl[i]==0){
        boolean left=(i==0)||(fl[i-1]==0);
        boolean right=(i==l-1)||(fl[i+1]==0);
        
        if(left&&right){
            n--;
            fl[i]=1;
            if(n==0)return true;
        }
        }

       }
         return false;
    }
}