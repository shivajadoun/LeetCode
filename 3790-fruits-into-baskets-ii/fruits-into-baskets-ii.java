class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
         int cnt=0;
         for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    baskets[j]=-1;
                    break;
                }
            if(j==baskets.length-1 && fruits[i]>baskets[j])cnt++;
                }
         }
         return cnt;
         

    }
}