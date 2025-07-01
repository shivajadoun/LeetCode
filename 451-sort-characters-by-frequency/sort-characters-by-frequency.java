import java.util.*;

class Solution {
    public String frequencySort(String s) {
    Map<Character,Integer>map=new HashMap<>();
    for(char num:s.toCharArray()){
        map.put(num,map.getOrDefault(num,0)+1);
    }
    String ans="";
      
while(map.size()>0){
    char key='0';
    int max=0;
for (Map.Entry<Character, Integer> entry : map.entrySet()) {
    if (entry.getValue() > max) {
        max = entry.getValue();
        key = entry.getKey();
    }
}
while(max-->0){
    ans+=key;
}
       
       map.remove(key);
}
  return ans;
    }
}
