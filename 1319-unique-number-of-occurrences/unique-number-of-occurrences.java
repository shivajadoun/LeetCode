class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
         HashSet<Integer> set = new HashSet<>();
        for (Integer value : map.values()) {
            if (!set.add(value)) {
                // set.add returns false if value already exists
                return false;
            }
        }
        return true;
    }
}