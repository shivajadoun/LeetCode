class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String minStr = (str1.length() < str2.length()) ? str1 : str2;
        String res = "";
        
        for (int i = 0; i < minStr.length(); i++) {
            String ans = minStr.substring(0, i + 1);
            
            if (str1.length() % ans.length() != 0 || str2.length() % ans.length() != 0) {
                continue;
            }
            boolean s1 = true;
            for (int j = 0; j <= str1.length() - ans.length(); j += ans.length()) {
                if (!str1.substring(j, j + ans.length()).equals(ans)) {
             s1 = false;
            break;
                }
            }

            boolean s2 = true;
            for (int j = 0; j <= str2.length() - ans.length(); j += ans.length()) {
                if (!str2.substring(j, j + ans.length()).equals(ans)) {
            s2 = false;
                    break;
                }
                }
            if (s1 && s2) {
                res = ans;
            }
          }

        return res;
    }
}
