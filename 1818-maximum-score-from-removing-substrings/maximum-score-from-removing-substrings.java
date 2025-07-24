class Solution {
    int count = 0;
    public int maximumGain(String s, int x, int y) {
        this.count = 0;
        if(y > x){
            s = new StringBuilder(s).reverse().toString();
            solveAbForward(solveAbForward(s, y), x);
            return count;
        }
        solveAbForward(solveAbForward(s, x), y);
        return count;
    }

    public String solveAbForward(String s, int x){
        String original = s;
        s = remainingAfterAbForwardProcessing(s);
        count += ((original.length() - s.length()) / 2) * x;
        return s;
    }

    public String remainingAfterAbForwardProcessing(String s){
        return asString(removeAbForward(s));
    }

    public Stack<Character> removeAbForward(String s){
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            if(c == 'b' && !stk.isEmpty() && stk.peek() == 'a'){
                stk.pop();
            }else{
                stk.push(c);
            }
        }
        return stk;
    }

    public String asString(Stack<Character> stk){
        StringBuilder reversed = new StringBuilder();
        while(!stk.isEmpty()){
            reversed.append(stk.pop());
        }
        return reversed.toString();
    }
}