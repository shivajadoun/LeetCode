class Solution {
    public int reductionOperations(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int cnt=0;
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
            pq.add(i);
        }
       
        while(!set.isEmpty()){
            int max=pq.poll();
            if(set.contains(max)){
                set.remove(max);
            }
            cnt+=set.size();
        }
         return cnt;
    }
}