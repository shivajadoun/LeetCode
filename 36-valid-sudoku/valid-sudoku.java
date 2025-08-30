class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0;i<9;i++){
             Map<Character,Integer>mapcol=new HashMap<>();
            Map<Character,Integer>maprow=new HashMap<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.') mapcol.put(board[i][j],mapcol.getOrDefault(board[i][j],0)+1);
                  if(board[j][i]!='.') maprow.put(board[j][i],maprow.getOrDefault(board[j][i],0)+1);
            }
            if(i%3==0){
             for(int k=0;k<9;k+=3){

              Map<Character,Integer>mapcol3=new HashMap<>();
                for(int j=i;j<i+3;j++ ){
                      for(int t=k;t<k+3;t++ ){

                if(board[j][t]!='.') mapcol3.put(board[j][t],mapcol3.getOrDefault(board[j][t],0)+1);
                      }
                }
             for(Integer val:mapcol3.values()){
                if(val>1)return false;
            }
            
            }
            }

            for(Integer val:mapcol.values()){
                if(val>1)return false;
            }
              for(Integer val:maprow.values()){
                if(val>1)return false;
            }
        }
        return true;
    }
}