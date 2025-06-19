class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ll=new ArrayList<>();
        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++){
             Arrays.fill(arr[i],'.'); 
        }
          solve(0,arr,ll);
             return ll;
    }
        private  void solve(int row,char arr[][],List<List<String>>res){
            if(row==arr.length){
                res.add(construct(arr));
                return ;
            }
            for(int col=0;col<arr.length;col++){
                if(isvalid(arr,row,col)){
                    arr[row][col]='Q';
                    solve(row+1,arr,res);
                    arr[row][col]='.';

                }
            }
        }
         private boolean isvalid(char arr[][],int row,int col){
            for(int i=0;i<row;i++){
                if(arr[i][col]=='Q')return false;
            }
            for(int i=row-1,j=col-1;j>=0 && i>=0 ;i--,j--){
                if(arr[i][j]=='Q')return false;
            }
            for(int i=row-1,j=col+1;j<arr.length && i>=0 ;i--,j++){
                if(arr[i][j]=='Q')return false;
            }
            return true;
         }
          private List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }
        return res;
    }
 }