class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
         HashSet<Integer> set = new HashSet<>();
        for (Integer value : map.values()) {
          set.add(value);
        }
        if(map.size()!=set.size())return false;
        return true;
    }
}