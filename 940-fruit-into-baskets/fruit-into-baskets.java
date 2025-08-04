class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer>map=new HashMap<>();
        int l=0;
        int r=0;
        int ans=0;
        for(int i=0;i<fruits.length;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while(map.size()>2){
                map.put(fruits[l],map.getOrDefault(fruits[l],0)-1);
                map.remove(fruits[l],0);
                l++;
            }
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}