class Solution {
    public int minimumRefill(int[] plants, int A, int B) {
        int ans = 0;
        int i = 0;
        int j = plants.length - 1;
        int a = A;
        int b = B;
        
        while (i < j) {
            if (plants[i] > a) {
                a = A;
                ans++;
            }
            a -= plants[i];

            if (plants[j] > b) {
                b = B;
                ans++;
            }
            b -= plants[j];

            i++;
            j--;
        }

        // If Alice and Bob meet at the same plant
        if (i == j && plants[i] > Math.max(a, b)) {
            ans++;
        }

        return ans;
    }
}
