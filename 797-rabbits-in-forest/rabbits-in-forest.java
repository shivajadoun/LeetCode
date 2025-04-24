class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:answers){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int cnt=0;
        for(Map.Entry<Integer,Integer>fr:map.entrySet()){
            int k=fr.getKey();
            int v=fr.getValue();
            int groupSize = k + 1;
            int groups = (v + k) / groupSize;
            cnt += groups * groupSize;
        }
        return cnt;
    }
}