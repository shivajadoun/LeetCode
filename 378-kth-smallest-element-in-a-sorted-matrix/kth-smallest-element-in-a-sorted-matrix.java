class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        // int arr[]=new int[matring.lenght];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                  pq.add(matrix[i][j]); 
            }
        }
        int ans=0;
        while(k>0){
            ans=pq.poll();
            k--;
        }
        return ans;
    }
}