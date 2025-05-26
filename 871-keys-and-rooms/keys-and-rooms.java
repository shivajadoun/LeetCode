class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer>qq=new LinkedList<Integer>();
        boolean[]visited=new boolean[rooms.size()];
        visited[0]=true;
        for(int i:rooms.get(0)){
            qq.add(i);
            visited[i]=true;
        }
        while(!qq.isEmpty()){
            int temp=qq.poll();
            for(int i:rooms.get(temp)){
            if(visited[i]==false){
                qq.add(i);
                visited[i]=true;
            }
        }
        }
        for(int i=1;i<visited.length;i++){
            if(visited[i]==false)return false;
        }
        return true;
    }
}