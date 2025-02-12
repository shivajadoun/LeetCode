class Solution {
         private int disum(int num){
        int ans=0;
        while(num!=0){
           ans+= num%10;
            num/=10;
        }
        return ans;
    }
    public int maximumSum(int[] nums) {
    
       HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
          for( int num:nums){
          int   key=disum(num);
          if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
          }
            map.get(key).add(num);
      }
      int ans=-1;
      for(int key:map.keySet()){
        ArrayList<Integer>list=map.get(key);
         Collections.sort(list);
         int n=list.size();
         if(n>=2){
            int sum=list.get(n-2)+list.get(n-1);
            ans=Math.max(ans,sum);
         }
      }
      return ans;
    }
   
}