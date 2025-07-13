class Solution {
    public int minDifficulty(int[] job, int d) {
        int arr[][]=new int[301][301];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(arr[i],-1);
        }
     int n=job.length;
     if(d>n)return -1;
     return solve(job,n,0,d,arr);
    }
    public static int solve(int job[],int n,int idx,int d,int arr[][]){
        if(d==1){
            int max=0;
            for(int i=idx;i<n;i++)max=Math.max(job[i],max);
            return max;
        }
        if(arr[idx][d]!=-1)return arr[idx][d];
        int max=0;
        int finalv=Integer.MAX_VALUE;
        for(int i=idx;i<=n-d;i++){
            max=Math.max(job[i],max);
            int res=max+solve(job,n,i+1,d-1,arr);
            finalv=Math.min(res,finalv);
        }
        return arr[idx][d]=finalv;
    }
}