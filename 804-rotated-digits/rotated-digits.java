class Solution {
    public int rotatedDigits(int n) {
    int cnt=0;
        for(int num=1;num<=n;num++){
            Set<Integer>set=new HashSet<>();
            int i=num;
             while(i>0){
               int rem=i%10;
                set.add(rem);
                i/=10;
             }
             if(set.contains(3)||set.contains(4)||set.contains(7))continue;
             if(set.contains(2)||set.contains(5)||set.contains(9)||set.contains(6))cnt++;
        }
        return cnt;
    }
}