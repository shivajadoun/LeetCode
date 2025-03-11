class Solution {
    public int numberOfSubstrings(String s) {
       HashMap<Character,Integer>map=new HashMap<>();
       int left=0;
       int cnt=0;
       for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        while(map.size()==3){
            cnt+=s.length()-i;
            map.put(s.charAt(left),map.get(s.charAt(left))-1);
            if(map.get(s.charAt(left))==0){
                map.remove(s.charAt(left));
            }
            left++;
        }
       }
       return cnt;
    }
}