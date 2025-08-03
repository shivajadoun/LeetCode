class Solution {
    public long minCost(int[] b1, int[] b2) {
        int n=b1.length;
        int min=Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> ll = new ArrayList<>();

        for(int i=0; i<n; i++){
            map.put(b1[i], map.getOrDefault(b1[i],0) + 1);
            min = Math.min(min, b1[i]);
        }
        for(int i=0; i<n; i++){
            map.put(b2[i], map.getOrDefault(b2[i],0) - 1);
            min = Math.min(min, b2[i]);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if(val % 2 != 0) return -1;
            if(val == 0) continue;
            for(int i=0; i<Math.abs(val)/2; i++){  // fix: start from i=0
                ll.add(key);
            }
        }

        if (ll.isEmpty()) return 0;  // fix: avoid accessing ll.get(0) if empty

        Collections.sort(ll);

        long res = 0;
        for(int i=0; i<ll.size()/2; i++){
            res += Math.min(ll.get(i), min*2);
        }
        return res;
    }
}
