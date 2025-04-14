class Solution {
    public int largestInteger(int nums) {
       String ss=Integer.toString(nums);
       int n=ss.length();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        
    arr[i] = ss.charAt(i)-'0';

       } 
       List<Integer>l1=new ArrayList();
        List<Integer>l2=new ArrayList();
        for(int num:arr){
            if(num%2==0)l1.add(num);
            else l2.add(num);
        }
          Collections.sort(l1, Collections.reverseOrder());
            Collections.sort(l2, Collections.reverseOrder());
         String ans="";
        int i=0;
        int j=0;
        for(int num:arr){
            if(num%2==0)ans+=l1.get(i++);
            else ans+=l2.get(j++);
        }

        
       return Integer.parseInt(ans);
    }
}