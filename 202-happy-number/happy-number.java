class Solution {
    public boolean isHappy(int n) {
        Set<Integer>set=new HashSet<>();
        for(int i=1;i<100000000;i++){
            int ans=0;
        while(n!=0){
            int rem=n%10;
            ans+=rem*rem;
            n/=10;
        }
        if(ans==1)return true;
        if(set.contains(ans))return false;
        else set.add(ans);
        n=ans;
        }
        return true;
    }
}