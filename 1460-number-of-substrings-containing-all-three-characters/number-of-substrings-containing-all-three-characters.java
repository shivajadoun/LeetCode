class Solution {
    public int numberOfSubstrings(String s) {
        int l=0;
        int n=s.length();
        int cnt=0;
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
           while(map.size()==3){
             cnt+=n-i;
             map.put(s.charAt(l),map.get(s.charAt(l))-1);
              if(map.get(s.charAt(l))==0)
                map.remove(s.charAt(l));
                 l++;
           }
          
        }
        return cnt;
    }
}