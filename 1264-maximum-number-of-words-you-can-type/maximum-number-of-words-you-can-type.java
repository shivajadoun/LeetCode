class Solution {
    public int canBeTypedWords(String text, String b) {
        String w[]=text.split(" ");
        int cnt=0;
            for(String s:w){
                boolean f=false;
                for(int i=0;i<s.length();i++){

                    for(int j=0;j<b.length();j++){
                       if(s.charAt(i)==b.charAt(j)){
                        f=true;
                        break;
                       }
                    }
                    if(f==true)break;
                }
                if(!f)cnt++;
            }
            return cnt;
    }
}