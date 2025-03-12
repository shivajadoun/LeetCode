class Solution {
    public long minimumSteps(String s) {
      int w=0;
      long ans=0;
      char arr[]=s.toCharArray();
      for(int i=arr.length-1;i>=0;i--){
        if(arr[i]=='1')ans+=w;
        else w++;
      }
      return ans;
    }
}