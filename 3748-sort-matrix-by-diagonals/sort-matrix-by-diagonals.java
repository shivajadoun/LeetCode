class Solution {
    public int[][] sortMatrix(int[][] grid) {
           
           int n=grid.length;
               int r=0;
               int t=1;
           while(r<n){
            int i=r;
            int j=0;
            List<Integer>ll=new ArrayList<>();
            while(i<n && j<n){
                ll.add(grid[i][j]);
                i++;
                j++;
            }
            i=r;
            j=0;
                  Collections.sort(ll, Collections.reverseOrder());
                   System.out.print(ll);
                    for(int a=0;a<ll.size();a++){
                        grid[i++][j++]=ll.get(a);
                    }  
                 r++; 

           }
            while(t<n){
            int i=0;
            int j=t;
            List<Integer>ll=new ArrayList<>();
            while(i<n && j<n){
                ll.add(grid[i][j]);
                i++;
                j++;
                // System.out.print(ll.get(i));
            }
            i=0;
            j=t;
                  Collections.sort(ll);
                    for(int a=0;a<ll.size();a++){
                        grid[i++][j++]=ll.get(a);
                    }    
                t++;
           }
           return grid;
    }
}