class Solution {
    public String makeFancyString(String s) {
        StringBuilder ss=new StringBuilder();
        int n=s.length();
        if(n<=2)return s;
        int cnt=1;
        for(int i=1;i<s.length();i++){
            if(cnt<3){
            ss.append(s.charAt(i-1));
            }
            if(s.charAt(i)==s.charAt(i-1))cnt++;
            else{
                cnt=1;
            }
            if(cnt<3 && i==n-1){
                ss.append(s.charAt(n-1));
            }

        }
        // if(s.charAt(n-1)!=s.charAt(n-2))ans+=s.charAt(n-1);
        return ss.toString();
    }
}