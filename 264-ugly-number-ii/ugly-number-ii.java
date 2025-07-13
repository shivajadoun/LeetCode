class Solution {
    public int nthUglyNumber(int n) {
      int arr[]=new int[n+1];
         arr[1]=1;
         int i2=1;
         int i3=1;
         int i5=1;
         for(int i=2;i<=n;i++){
            int iv2=arr[i2]*2;
            int iv3=arr[i3]*3;
            int iv5=arr[i5]*5;
            arr[i]= Math.min(iv2,Math.min(iv3,iv5));
           if(arr[i]==iv2)i2++;
           if(arr[i]==iv3)i3++;
           if(arr[i]==iv5)i5++;
         }
         return arr[n];

    }
}