class Solution {
    public long pickGifts(int[] gifts, int k) {
         PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
         for(int nums:gifts) pq.add(nums);
         while(k>0){
           int   root=pq.poll();
            pq.add((int)Math.sqrt(root));
            k--;
         }
         long ans=0;
         while(!pq.isEmpty()) ans+=pq.poll();
         return ans;
    }
}