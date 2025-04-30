
class Solution {
    public int[] frequencySort(int[] nums) {
        int arr[]=new int[nums.length];
        int k=0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
            while(k<nums.length){
            int min=Integer.MAX_VALUE;
            int key=-1;
            for(Map.Entry<Integer,Integer>ele:map.entrySet()){
            if(min>ele.getValue()){
                min=ele.getValue();
                key=ele.getKey();
            }
            else if(min==ele.getValue() && key<ele.getKey()){
                key=ele.getKey();
            }
            }
                // System.out.println(key + " " + min);
            while(min>0){
             arr[k++]=key;
             min--;
            }
            map.remove(key);
            }
        
        return arr;
    }
      
    }
