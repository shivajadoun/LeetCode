class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer>ll=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            int curr=matrix[i][j];
            boolean row=true;
            boolean col=true;
            for(int c=0;c<n;c++){
                if(matrix[i][c]>=curr)continue;
                else{
                    col=false;
                    break;
                }

            }
             for(int r=0;r<m;r++){
                if(matrix[r][j]<=curr)continue;
                else{
                    row=false;
                    break;
                }
                
            }
            if(row && col){
                ll.add(curr);
            }
        }
        }
        return ll;
    }
}