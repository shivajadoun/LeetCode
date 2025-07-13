class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean tt=false;
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            if(target>=matrix[i][0] && target<=matrix[i][m-1]){
                int l=0;
                int r=m-1;
                int mid=0;
           while(l<=r){
            mid=l+(r-l)/2;
            if(matrix[i][mid]==target)return true;
            if(matrix[i][mid]>target)r=mid-1;
            if(matrix[i][mid]<target)l=mid+1;
           }
           
        }
        }
        return false;
    }
}