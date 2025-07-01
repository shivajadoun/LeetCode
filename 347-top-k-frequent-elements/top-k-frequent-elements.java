class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[]=new int[k];
        int i=0;
    Map<Integer,Integer>map=new HashMap<>();
    for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
    }
       while(k-->0){
        int maxValue = Integer.MIN_VALUE;
        int key=0;

for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if (entry.getValue() > maxValue) {
        maxValue = entry.getValue();
        key = entry.getKey();
    }
}
       arr[i++]=key;
       map.remove(key);
  }
  return arr;

    }
}