class Solution {
    public int maxVowels(String S, int k) {
        int cnt=0;
        int n=S.length();
        for(int i=0;i<k;i++){
            if(S.charAt(i)=='a' ||  S.charAt(i)=='e' ||  S.charAt(i)=='i' ||  S.charAt(i)=='o' ||  S.charAt(i)=='u'){
                cnt++;
            }
        }
        int max=cnt;
        int j=0;
        for(int i=k;i<n;i++){
              if(S.charAt(i)=='a' ||  S.charAt(i)=='e' ||  S.charAt(i)=='i' ||  S.charAt(i)=='o' ||  S.charAt(i)=='u'){
                cnt++;
              }
                 if(S.charAt(j)=='a' ||  S.charAt(j)=='e' ||  S.charAt(j)=='i' ||  S.charAt(j)=='o' ||  S.charAt(j)=='u'){
                    cnt--;
                 }
                 j++;
                 max=Math.max(cnt,max);
        }
        return max;
    }
}