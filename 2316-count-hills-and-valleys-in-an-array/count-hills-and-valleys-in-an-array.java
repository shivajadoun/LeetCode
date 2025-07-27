class Solution {
    public int countHillValley(int[] nums) {
          List<Integer>ll=new ArrayList<>();
          for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i])continue;
            else ll.add(nums[i-1]);
         
          }
         ll.add(nums[nums.length-1]);

             for(int i=0;i<ll.size();i++){
            
          System.out.print(ll.get(i)+" ");
          }
          int ans=0;
          for(int i=1;i<ll.size()-1;i++){
              if((ll.get(i)>ll.get(i-1)&&ll.get(i)>ll.get(i+1)) || ( ll.get(i)<ll.get(i-1)&&ll.get(i)<ll.get(i+1)))  {
                ans+=1;
                // System.out.print(ll.get(i)+" ");
              }
          }
          return ans;

    }
}