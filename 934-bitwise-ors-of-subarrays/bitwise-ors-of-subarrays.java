class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>();
        Set<Integer>  prev=new HashSet<>();
        for(int i:arr){
        Set<Integer>curr=new HashSet<>();
        curr.add(i);
        for(int x:prev){
            curr.add(i|x);
        }
        res.addAll(curr);
        prev=curr;
    }
       return res.size();
    }
}
