class Solution {
    public int punishmentNumber(int n) {
      int ans=0;
      for(int i=1;i<=n;i++){
      int  sq=i*i;
        boolean check=subS(sq,0,i);
        if(check){
            ans+=sq;
        }

      }
      return ans;
    }
    private boolean subS(int n,int dig,int target){
        if(n==0)return dig==target;
        if(dig>target)return false;
        boolean  rem10=subS(n/10,dig+n%10,target);
         boolean  rem100=subS(n/100,dig+n%100,target);
          boolean rem1000=subS(n/1000,dig+n%1000,target);
            boolean rem10000=subS(n/10000,dig+n%10000,target);
          return rem10||rem100||rem1000||rem10000;
    }
}