class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            int cnt=0;
            Map<Character,Integer>map=new HashMap<>();
            for(int j=i;j<s.length();j++){
             if (map.containsKey(s.charAt(j))) break;

                map.put(s.charAt(j) ,map.getOrDefault(s.charAt(j),0)+1);
                cnt++;
                
            }
            max=Math.max(cnt,max);
        }
        return max;
    }
}