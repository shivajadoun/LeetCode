class Solution {
        public void solve(int arr[],int idx,List<Integer>output,Set<List<Integer>>ans){
            if(idx>=arr.length){
                if(output.size()>1){
                 ans.add(new ArrayList<>(output));
                }
                return ;
            }
            if(output.size()==0 || arr[idx]>=output.get(output.size()-1)){
                output.add(arr[idx]);
                solve(arr,idx+1,output,ans);
                output.remove(output.size()-1);
            }
              solve(arr,idx+1,output,ans);
              return ;
        }
    public List<List<Integer>> findSubsequences(int[] nums) {
          Set<List<Integer>>ll=new HashSet<>();
          solve(nums,0,new ArrayList<>(),ll);
          return new ArrayList<>(ll);
    }
}