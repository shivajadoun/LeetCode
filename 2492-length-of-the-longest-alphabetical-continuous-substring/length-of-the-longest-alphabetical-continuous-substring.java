class Solution {
    public int longestContinuousSubstring(String s) {
        int n = s.length();
        if (n == 1) return 1;

        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) - s.charAt(i - 1) == 1) {
                currLen++;
            } else {
                currLen = 1;
            }
            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}
