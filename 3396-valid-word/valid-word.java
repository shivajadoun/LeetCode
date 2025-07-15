class Solution {
    public boolean isValid(String word) {
        String s=word.toLowerCase();  
         if(s.length()<3)return false;
        int vov=0;
        int con=0;
        for(int c:s.toCharArray()){
            if(c>='0' && c<='9')continue;
            else if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')vov++;
            else if(c>='a' && c<='z')con++;
            else return false;
        }
        if( vov>=1 && con>=1)return true;
        return false;
    }
}