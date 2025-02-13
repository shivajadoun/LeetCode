class Solution {
    public int minOperations(int[] nums, int k) {
           PriorityQueue<Long>pq=new PriorityQueue<>();
           for(int num:nums){
            pq.add((long)num);
           }
           int cnt=0;
           while(!pq.isEmpty()){
            long val=pq.poll();
            if(val>=k)return cnt;
            long val2=pq.poll();
            pq.add(Math.min(val,val2)*2+Math.max(val,val2));
            cnt++;
           }
           return cnt;
    }
}