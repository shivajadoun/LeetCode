class Solution {
    public long maximumHappinessSum(int[] hap, int k) {
        Arrays.sort(hap);
        long ans=0;
        long d=0;
        for(int i=hap.length-1;i>=0;i--){ 
            if(hap[i]-d<=0){
                return ans;
            }
                ans+=hap[i]-d;
                k--; 
            d++;
            if(k==0)break;
            
        }
            
        
        return ans;
    }
}