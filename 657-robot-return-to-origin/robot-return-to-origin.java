class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length()%2!=0)return false;
      Map<Character,Integer>map=new HashMap<>();
      map.put('L',0);
      map.put('R',0);
      map.put('D',0);
      map.put('U',0);
        for(char ch:moves.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int left=map.get('L');
        int right=map.get('R');
        int up=map.get('U');
        int down=map.get('D');
        if(left==right && up==down) return true;
        return false;

    }
}