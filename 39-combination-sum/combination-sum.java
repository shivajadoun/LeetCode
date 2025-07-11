class Solution {
    public void helper(List<List<Integer>> mainlist,List<Integer> list,int[] candidates, int target,int index,int curr)
    {
        if(target==0){
            mainlist.add(new ArrayList<>(list));
            return;
        }
        if(target<0) return;

        for(int i=index;i<candidates.length;i++){
            list.add(candidates[i]);
            helper(mainlist,list,candidates,target-candidates[i],i,curr);
            list.remove(list.size()-1);
        }
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> mainlist = new ArrayList<>();
        if(target<candidates[0]){
            return mainlist;
        }
        helper(mainlist,new ArrayList<>(),candidates,target,0,candidates[0]);
        return mainlist;
    }
}