class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int arr[] = new int[1001];  

        for (int i = 0; i < trips.length; i++) {
            int cap = trips[i][0];
            int st = trips[i][1];
            int end = trips[i][2];
            arr[st] += cap;
            arr[end] -= cap;
        }

        for (int i = 1; i <= 1000; i++) {
            arr[i] += arr[i - 1];
           
        }
        for(int c:arr){
            if(c>capacity)return false;
        }

        return true;
    }
}
