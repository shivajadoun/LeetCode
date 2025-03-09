class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int arr[]=new int [colors.length+k-1];
        int j=0;
        for(int i=0;i<colors.length;i++){
         arr[j++]=colors[i];
        }
         for(int i=0;i<k-1;i++){
         arr[j++]=colors[i];
        }
        int left=0,right=0,cnt=0;
        while(right<arr.length){
            if(right!=0&&arr[right]==arr[right-1])left=right;
            if(right-left+1>=k)cnt++;
            right++;
        }
        return cnt;
    }
}