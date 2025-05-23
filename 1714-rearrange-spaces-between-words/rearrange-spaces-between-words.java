class Solution {
    public String reorderSpaces(String text) {
        int spaceCount = 0;

        for (char c : text.toCharArray()) {
            if (c == ' ') spaceCount++; 
        }

        String[] words = text.trim().split("\\s+");
        int numWords = words.length;

        StringBuilder sb = new StringBuilder();

        if (numWords == 1) {
            sb.append(words[0]);
            for (int i = 0; i < spaceCount; i++) {
                sb.append(' ');
            }
        } else {
            int spaceBetween = spaceCount / (numWords - 1);
            int remainingSpaces = spaceCount % (numWords - 1);

            for (int i = 0; i < numWords; i++) {
                sb.append(words[i]);
                if (i < numWords - 1) {
                    for (int j = 0; j < spaceBetween; j++) {
                        sb.append(' ');
                    }
                }
            }

            for (int i = 0; i < remainingSpaces; i++) {
                sb.append(' ');
            }
        }

        return sb.toString();
    }
}
