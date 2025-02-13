class Solution {
    public String frequencySort(String s) {
       StringBuilder ans=new StringBuilder();
       HashMap<Character,Integer>map=new HashMap<>();
       for(char ch:s.toCharArray()){
          map.put(ch,map.getOrDefault(ch,0)+1);
       }
          while(!map.isEmpty()){
            char maxc=' ';
            int max=0;
            for(char key:map.keySet()){
                if(map.get(key)>max){
                maxc=key;
                max=map.get(key);
                }
            }
            while(max>0){
                ans.append(maxc);
                max--;
            }
            map.remove(maxc);
          }

          return ans.toString();
    }
}