class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int n=candyType.length;
        int cnt=1;
        for(int i=1;i<n;i++){
            
            if(candyType[i]!=candyType[i-1]){
                cnt++;
            }
            
        }
        if(cnt<n/2)
        return cnt;
        return n/2;
    }
}