class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int sum=0;
           for(int num:nums){
            sum+=num;
            if(num!=0)
            pq.add(num);
        }
     int s=0,c=0;
        while(!pq.isEmpty()){
            int size=pq.size();
            int val=pq.poll();
            val=val-s;
            if(val==0) continue;
            s+=val;
            sum-=(size*val);
            c++;
            if(sum<=0)return c;
            
        }
        return c;

    }
}