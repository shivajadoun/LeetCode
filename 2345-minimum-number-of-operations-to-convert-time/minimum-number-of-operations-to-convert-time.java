class Solution {
    public int convertTime(String current, String correct) {
        String curr[]=current.split(":");
        String corr[]=correct.split(":");
        int ans=0;
            ans=Integer.parseInt(curr[0])*60;
            ans+=Integer.parseInt(curr[1]);
              int ans2=0;
            ans2=Integer.parseInt(corr[0])*60;
            ans2+=Integer.parseInt(corr[1]);
            int time=Math.abs(ans-ans2);
             int cnt=0;
            while(time!=0){
                if(time>=60) time-=60;
               else if(time>=15)time-=15;
               else if(time>=5)time-=5;
               else if(time>=1)time-=1;
                  cnt++;
            }
            return cnt;
    }
}