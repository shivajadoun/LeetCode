class Solution {
    public int[] plusOne(int[] digits) {
        int size=digits.length;
        int carry=0;
        List<Integer> ans=new ArrayList<>();
        for(int i=size-1;i>=0;i--){
            int sum=digits[i];
            if(i==size-1){
                sum+=1;
            }
            sum+=carry;
            carry=sum/10;
            ans.add(sum%10);
        }
        if(carry>0){
            ans.add(carry);
        }
        int[] res=new int[ans.size()];
        int idx=0;
        for(int i=ans.size()-1;i>=0;i--){
            res[idx++]=ans.get(i);
        }
        return res;
    }
}