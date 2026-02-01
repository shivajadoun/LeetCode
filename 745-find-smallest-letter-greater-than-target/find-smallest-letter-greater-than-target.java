class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    
        int ans=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0;i<letters.length;i++){ 
            int n=letters[i]-target;
            if(n>0 && ans>n){
                idx=i;
                ans=n;
            }
            
            

        }
        if(idx==-1)return letters[0];
        return letters[idx];
    }
}