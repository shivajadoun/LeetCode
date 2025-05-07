import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();

       
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        backtrack(ans, new ArrayList<>(), nums.length, freqMap);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> tempList, int targetLen, Map<Integer, Integer> freqMap) {
        if (tempList.size() == targetLen) {
            ans.add(new ArrayList<>(tempList));
            return;
        }
        for (int num : freqMap.keySet()) {
            if (freqMap.get(num) == 0) continue;
            tempList.add(num);
            freqMap.put(num, freqMap.get(num) - 1);
            backtrack(ans, tempList, targetLen, freqMap);
            tempList.remove(tempList.size() - 1);
            freqMap.put(num, freqMap.get(num) + 1);
        }
    }
}
