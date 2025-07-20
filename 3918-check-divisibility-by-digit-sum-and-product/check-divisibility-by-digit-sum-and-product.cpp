class Solution {
public:
    bool checkDivisibility(int n) {
        int nn=n;
        int sum=0;
        int p=1;
        while(n>0){
            int l=n%10;
            p*=l;
            sum+=l;
            n/=10;
        }
        return (nn%(p+sum))==0;
    }
};