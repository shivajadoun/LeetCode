class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
    double max=0;
    int k=0;
        for(int i=0;i<d.length;i++){
             int len=d[i][0]*d[i][0]+d[i][1]*d[i][1];
             double sq=Math.sqrt(len);
             if(max<sq){
                max=sq;
                k=i;
             } else if(max==sq && d[k][0]*d[k][1]<d[i][0]*d[i][1]){
                     k=i;
             }
        }
             return d[k][0]*d[k][1];
        
    }
}