class Solution {
    public int kthFactor(int n, int k) {
        List<Integer>ll=new ArrayList<>();
        int i=1;
        while(n>=i){
            if(n%i==0){
                ll.add(i);
            }
            i++;
        }
        if(ll.size()<k)return -1;
        int ans=ll.get(k-1);
        return ans;
    }
}