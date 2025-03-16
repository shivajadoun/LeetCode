class Solution {
    public long repairCars(int[] arr, int car) {
        long l=1,r=Long.MAX_VALUE,mid;
        long ans=Long.MAX_VALUE;
        Arrays.sort(arr);
        while(l<=r)
        {
            mid=l+(r-l)/2;
            long a=timetaken(arr,mid,car);
            if(a<ans)
            {
                ans=a;
                r=mid-1;
            }
            else
            l=mid+1;
        }
        return ans;
    }
    public long timetaken(int[] arr, long mid, int car)
    {
        int carscount=0;
        for(int i=0;i<arr.length;i++)
        {
            carscount+=Math.sqrt(mid/arr[i]);
            if(carscount>=car)
            return mid;
        }
        return Long.MAX_VALUE;
    }
}