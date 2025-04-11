class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(i);
            } else if (ch == ')') {
                if (st.empty()) {
                    str.deleteCharAt(i);
                    i -= 1;
                }
                if (!st.empty()) {
                    st.pop();
                }
            }
        }
        while (!st.empty()) {
            str.deleteCharAt(st.peek());
            st.pop();
        }
        return str.toString();
    }
}