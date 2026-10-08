class Solution {
    public String removeOuterParentheses(String s) {
        String st="";
        int j=0;
        for(int i=0;i<s.length()-1;i++){
              if(s.charAt(i)=='('){
                if(j>0)
                st+='(';
                j++;
              }else{
               j--;
               if(j>0)st+=s.charAt(i);
              }
        }
        return st;
    }
}