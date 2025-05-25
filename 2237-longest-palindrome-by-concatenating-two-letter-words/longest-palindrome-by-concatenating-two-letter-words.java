class Solution {
    public int longestPalindrome(String[] words) {

        Map<String,Integer>map=new HashMap<>();
        int cnt=0;
        for(String s:words){
            String rev="";
           rev+= s.charAt(1);
            rev+= s.charAt(0);
            if(map.containsKey(rev)){
                cnt+=4;
                map.put(rev,map.get(rev)-1);
                if(map.get(rev)==0)map.remove(rev);
            }else
            map.put(s,map.getOrDefault(s,0)+1);
        }
       
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            String key=entry.getKey();
          
           String rev="";
           rev+= key.charAt(1);
            rev+= key.charAt(0);
            if(rev.equals(key)){
                cnt+=2;
                break;
            }
 
        }
        
        
        
   return cnt;
    }
}