class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>>ll1=new ArrayList<>();
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            diff=Math.min(diff,arr[i]-arr[i-1]);
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==diff){
                List<Integer>ll=new ArrayList<>();
                ll.add(arr[i-1]);
                ll.add(arr[i]);
                ll1.add(ll);
            }
        }
        return ll1;
    }
}