class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] count = new int[26];
        for (char c : tasks) {
            count[c - 'A']++;
        }

        for (int f : count) {
            if (f > 0) {
                pq.add(f);
            }
        }

        int time = 0;
        while (!pq.isEmpty()) {
            int k = n + 1;
            ArrayList<Integer> temp = new ArrayList<>();
            while (k > 0) {
                if (!pq.isEmpty()) {
                    int task = pq.poll();
                    task--;
                    if (task > 0) {
                        temp.add(task);
                    }
                }
                time++;
                k--;
                if(pq.isEmpty() && temp.isEmpty()){
                    break;
                }
            }
            for (int t : temp) {
                pq.add(t);
            }
        }

        return time;
    }
}