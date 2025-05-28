class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>ans=new ArrayList<>();
        counting(0,n,ans);
        return ans;
    }
    private static void counting(int curr,int n,List<Integer>ans){
        if(curr>n)return;
        if(curr!=0)
        ans.add(curr);
        int i=0;
        if(curr==0)i=1;
        while(i<=9){
            counting(curr*10+i,n,ans);
            i++;
        }
    }
}