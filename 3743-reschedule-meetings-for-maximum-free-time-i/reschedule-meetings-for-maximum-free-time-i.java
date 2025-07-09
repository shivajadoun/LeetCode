class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        List<Integer>ll=new ArrayList<>();
        ll.add(startTime[0]);
        for(int i=1;i<startTime.length;i++){
            int diff=startTime[i]-endTime[i-1];
            ll.add(diff);
          
        }
        int lastDiff=eventTime-endTime[endTime.length-1];
        ll.add(lastDiff);
        int max=0;
        int i=0;
        for(i=0;i<=k;i++){
            max+=ll.get(i);
        }
        int temp=max;
        for( i=k+1;i<ll.size();i++){
            temp=temp-ll.get(i-k-1)+ll.get(i);
            max=Math.max(temp,max);
        }
        return max;
    }
}