class Solution {
    public int[] numberGame(int[] nums) {
        int arr[]=new int[nums.length];
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
        }
        int i=0;
        while(!pq.isEmpty()){
        int val1=pq.poll();
        int val2=pq.poll();
        arr[i++]=val2;
        arr[i++]=val1;
        }
        return arr;
    }
}