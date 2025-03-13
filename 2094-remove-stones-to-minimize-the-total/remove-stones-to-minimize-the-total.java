class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int c:piles)pq.add(c);
    
    while(k>0){
        int p=pq.poll();
        if(p%2!=0)   p=p/2+1;
        else  p/=2;
        pq.add(p);
        k--;
    }
    int ans=0;
    while(!pq.isEmpty())    ans+=pq.poll();
      return ans;
   }  
}