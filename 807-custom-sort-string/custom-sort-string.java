class Solution {
    public String customSortString(String order, String s) {
       HashMap<Character,Integer>map=new HashMap<>();
       for( int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       }
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<order.length();i++){
        char ch=order.charAt(i);
        if(map.containsKey(ch)){
            int cnt=map.get(ch);
            while(cnt>0){
                sb.append(ch);
                 cnt--;
            }
             map.remove(ch);
        }

       }
       for(char ch:map.keySet()){
           int cnt=map.get(ch);
           while(cnt>0){
             sb.append(ch);
             cnt--;
           }
           
       }
       return sb.toString();
    }
}