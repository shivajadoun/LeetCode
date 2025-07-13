class Solution {
    public int maxLength(List<String> arr) {
        String temp="";
        int n=arr.size();
       return solve(arr,n,0,temp);

    }
      public static boolean isduplicate(String s1,String s2){
          int arr[]=new int[26];
          for(char c:s1.toCharArray()){
            if(arr[c-'a']>0)return true;
          else  arr[c-'a']++;
          }
           for(char c:s2.toCharArray()){
            if(arr[c-'a']>0)return true;
            else arr[c-'a']++;
          }
          return false;
          
      }
    public static int solve(List<String>arr,int n,int i,String temp){
        if(i>=n)return temp.length();
        int include=0;
        int exclude=0;
        if(isduplicate(arr.get(i),temp)){
             exclude=solve(arr,n,i+1,temp);
        }else{
            include=solve(arr,n,i+1,temp+arr.get(i));
              exclude=solve(arr,n,i+1,temp);
        }
        return Math.max(include,exclude);

    }
}