class Solution {
public:
    bool isReachable(int x, int y) {
        int n=__gcd(x,y);
        return n>0 && not(n&(n-1));
    }
};