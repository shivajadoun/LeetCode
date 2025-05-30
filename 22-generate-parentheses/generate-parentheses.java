class Solution {
      Stack<Character>stack=new Stack<>();
        List<String>ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
      backtrack(0,0,n);
      return ans;

    }
    private void backtrack(int openN,int closedN,int n){
        if(openN==closedN && closedN==n){
            Iterator<Character>val=stack.iterator();
            String temp="";
            while(val.hasNext()){
               temp=temp+val.next();
            }
            ans.add(temp);
        }
        if(openN<n){
            stack.push('(');
            backtrack(openN+1,closedN,n);
            stack.pop();
        }
        if(closedN<openN){
            stack.push(')');
            backtrack(openN,closedN+1,n);
            stack.pop();
        }
    }
}