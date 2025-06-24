class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer>ll=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
           if(nums[i]==key)ll.add(i);
        }
        for(int i=0;i<ll.size();i++){
            for(int j=0;j<nums.length;j++){
                if(Math.abs(j-ll.get(i))<=k)set.add(j);
            }
        }
        List<Integer>ans=new ArrayList<>();
        for(int num:set){
            ans.add(num);
        }
            Collections.sort(ans);
        return ans;
    }
}