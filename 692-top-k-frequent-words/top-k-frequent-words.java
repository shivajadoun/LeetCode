class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer>map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        String arr[]=new String[k];
        int j=0;
      while(k-- > 0){
    int max = 0;
    String key = "";
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        if (entry.getValue() > max) {
            max = entry.getValue();
            key = entry.getKey();
        } else if (entry.getValue() == max) {
            if (entry.getKey().compareTo(key) < 0) {
                key = entry.getKey();
            }
        }
    }
    arr[j++] = key;
    map.remove(key);
}
    
        return Arrays.asList(arr);
    }
}