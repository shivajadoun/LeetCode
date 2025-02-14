class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      pq.add(a);
      pq.add(b);
      pq.add(c);
      int count=0;
      while(!pq.isEmpty()){
        int val=pq.poll();
        if(val<=0)return count;  
        else{
            int val2=0;
             val2=pq.poll();
            // if(val==val2&&val2==1)return count;
            if(val<=0 || val2 <=0 ) return count;
            val-=1;
            val2-=1;
            System.out.println(val+"  "+val2);
            pq.add(val);
            pq.add(val2);
        }
           count++;
      }
        return count;
    }
}