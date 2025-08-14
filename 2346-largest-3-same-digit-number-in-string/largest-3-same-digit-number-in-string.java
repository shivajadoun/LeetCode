class Solution {
    public String largestGoodInteger(String num) {
          List<Integer>ll=new ArrayList<>();
          for(int i=2;i<num.length();i++){
            String s="";
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i-1)== num.charAt(i-2)){
                s+=num.charAt(i);
                 s+=num.charAt(i);
                  s+=num.charAt(i);
                  ll.add(Integer.parseInt(s));
            }
            
          }
          if( ll.size()==0) return "";
          Collections.sort(ll);
          if(ll.get(ll.size()-1)==0)return "000";
          
          return ll.get(ll.size()-1).toString();
    }
}