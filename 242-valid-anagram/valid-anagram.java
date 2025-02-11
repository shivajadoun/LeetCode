class Solution {
    static HashMap<Character,Integer>makefreMap(String str){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!map.containsKey(str.charAt(i))){
                map.put(ch,1);
            }else{
              int freq=map.get(ch);
              map.put(ch,freq+1);
        }
        }
        return map;
        }
    
    public boolean isAnagram(String s, String t) {
   
    if(s.length()!=t.length())return false;
    HashMap<Character,Integer>map1=makefreMap(s);
    HashMap<Character,Integer>map2=makefreMap(t);

      return map1.equals(map2);     
    }
}