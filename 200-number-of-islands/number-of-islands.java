class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    BFS(grid,i,j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    private void BFS(char[][] grid, int i, int j){
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int[] nums=new int[2];
        nums[0]=i;
        nums[1]=j;
        q.offer(nums);
        grid[i][j]='X';
        int[][] directions=new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
        while(!q.isEmpty()){
            int k=q.size();
            for(int l=0;l<k;l++){
                int[] cordi=q.poll();
                int x=cordi[0];
                int y=cordi[1];
                for(int[] dir:directions){
                    int newX=x+dir[0];
                    int newY=y+dir[1];
                    if(newX>=0 && newX <m && newY >=0 && newY <n && grid[newX][newY]=='1'){
                        q.offer(new int[]{newX,newY});
                        grid[newX][newY]='X';
                    }
                }
            }
        }
    }
}