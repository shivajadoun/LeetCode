class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder st=new StringBuilder();
        int n=part.length();
        for(int i=0;i<s.length();i++){
            st.append(s.charAt(i));
            if(st.length()>=n){
                String str=st.substring(st.length()-n);
                if(str.equals(part)){
                    st.setLength(st.length()-n);
                }
            }
            
        }
        return st.toString();
    }
}