import java.util.ArrayList;
import java.util.List;

class Solution {
    private void Solve(String digits, List<String> answer, int index, String mapping[], StringBuilder output) {
        if (index == digits.length()) {
            if (output.length() > 0) {
                answer.add(output.toString());
            }
            return;
        }
        int num = digits.charAt(index) - '0';
        String value = mapping[num];
        for (int i = 0; i < value.length(); i++) {
            output.append(value.charAt(i));
            Solve(digits, answer, index + 1, mapping, output);
            output.deleteCharAt(output.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return answer;
        }
        int index = 0;
        StringBuilder output = new StringBuilder();
        String mapping[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        Solve(digits, answer, index, mapping, output);
        return answer;
    }
}