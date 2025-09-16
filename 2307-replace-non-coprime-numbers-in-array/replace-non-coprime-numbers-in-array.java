class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer>ll=new ArrayList<>();
        if(nums.length==1){
            ll.add(nums[0]);
            return ll;
        }
           if(gcd(nums[0],nums[1])!=1){
            ll.add(lcm(nums[0],nums[1]));
           }else{
            ll.add(nums[0]);
           }
           int j=0;
     for(int i=1;i<nums.length;i++){
    ll.add(nums[i]);
    j++;
    
    // keep merging while last two are not coprime
    while(j > 0 && gcd(ll.get(j), ll.get(j-1)) != 1){
        int merged = lcm(ll.get(j), ll.get(j-1));
        ll.remove(j);
        ll.remove(j-1);
        ll.add(merged);
        j = ll.size() - 1; // update index
    }
}

        return ll;
    }
    private int gcd(int x, int y) {
    while (y != 0) {
        int temp = y;
        y = x % y;
        x = temp;
    }
    return x;
}

   private int lcm(int x,int y){
    int g = gcd(x, y);
   
    return (int)((1L * x / g) * y);
}
}