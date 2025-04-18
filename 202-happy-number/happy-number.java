class Solution {
    public boolean isHappy(int n) {
        Set<Integer>set=new HashSet<>();
    while(!set.contains(n)){

       set.add(n);
     n=helper(n);
     if(n==1)return true;
       
    }
       return false;
    }
    private int helper(int n){
        int ans=0;
    while(n!=0){

        int rem=n%10;
        ans+=rem*rem;
        n/=10;
    }
    return ans;
    }
}