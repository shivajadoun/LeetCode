class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rev(arr[i]);
        }
        return String.join(" ", arr); 
    }

    private String rev(String t) {
        char arr[] = new char[t.length()];
        int n = t.length();
        for (int i = 0; i < n; i++) {
            arr[i] = t.charAt(n - 1 - i); 
        }
        return new String(arr); 
    }
}
