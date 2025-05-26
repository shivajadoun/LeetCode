class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int vis[]=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==1||vis[i]==-1){
                continue;
            }
            Queue<Integer>qq=new LinkedList<>();
            qq.add(i);
            vis[i]=1;
            while(!qq.isEmpty()){
                int curr=qq.poll();
                for(int e:graph[curr]){
                    if(vis[e]==0){
                        vis[e]=-vis[curr];
                        qq.add(e);
                    }
                    if(vis[e]==vis[curr])return false;
                }
            }
        }
        return true;
    }
}