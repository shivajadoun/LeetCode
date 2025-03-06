class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int arr[]=new int[2];
        for(int key:map.keySet()){
            int cnt=map.get(key);
            if(cnt>=2){
              arr[0]=key;
            }
        }
        int l=grid.length*grid[0].length;
        System.out.print(l);
         for(int i=1;i<=l;i++){
            if(!map.containsKey(i)){
                arr[1]=i;
            }
         }
        return arr;
    }
}