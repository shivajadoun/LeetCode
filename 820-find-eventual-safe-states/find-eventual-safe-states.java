class Solution {
    public List<Integer> eventualSafeNodes(int[][] prerequisites) {
     List<List<Integer>>ll=new ArrayList<>();
     int n=prerequisites.length;
     int inDeg[]=new int[n];
    
    for(int i=0;i<n;i++){
        ll.add(new ArrayList<>());
    }
    for(int i=0;i<prerequisites.length;i++){
        for(int nbr:prerequisites[i]){
            ll.get(nbr).add(i);
  inDeg[i]++; 
        }
      
    }
    Queue<Integer>q=new LinkedList<>();
    for(int i=0;i<n;i++){
        if(inDeg[i]==0)q.add(i);
    }
    List<Integer>ans=new ArrayList<>();
    while(!q.isEmpty()){
        int curr=q.poll();
        ans.add(curr);
        
        for(int k:ll.get(curr)){
            inDeg[k]--;
            if(inDeg[k]==0){
                q.add(k);
            }
        }
        
    }
       Collections.sort(ans);
       return ans;
    }
}