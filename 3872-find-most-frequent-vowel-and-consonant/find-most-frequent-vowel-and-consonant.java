class Solution {
    public int maxFreqSum(String s) {
        int arr[]=new int[26];
          for(char c:s.toCharArray()){
            arr[c-'a']++;
          }
          int maxc=0;
        int maxv=0;
          for(int i=0;i<26;i++){
              if(i==0 || i==8||i==4||i==14||i==20){maxv=Math.max(maxv,arr[i]);
                System.out.print(arr[i]+" ");
              }
              else  maxc=Math.max(maxc,arr[i]);
          }
          return maxv+maxc;

    }
}