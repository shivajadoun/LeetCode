class Solution {
    static int n;
     static int ans[]=new int[50001];
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
     
        Arrays.fill(ans,-1);
         n=startTime.length;
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=startTime[i];
             arr[i][1]=endTime[i];
              arr[i][2]=profit[i];  
        }
          Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        return solve(arr,0,ans);

    }
    public static int solve(int arr[][],int i,int []ans){
         if(i>=n)return 0;
         if(ans[i]!=-1)return ans[i];
         int next=nextele( arr,i+1,arr[i][1]);
         int take=arr[i][2]+solve(arr,next,ans);
         int notTake=solve(arr,i+1,ans);
         return  ans[i]= Math.max(take,notTake);
    }
    public static int nextele(int arr[][],int l,int currJend){
        int r=n-1;
        int res=n;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid][0]>=currJend){
                res=mid;
                r=mid-1;

            }else l=mid+1;
        }
        return res;

    }
}