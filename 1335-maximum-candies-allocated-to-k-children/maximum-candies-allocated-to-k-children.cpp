class Solution {
public:
    int maximumCandies(vector<int>& candies, long long k) {
       
        sort(begin(candies),end(candies));
        long long maxi=0;
        long long i=1;
        long long j=candies[candies.size()-1];
        while(i<=j){
            long long mid=i+(j-i)/2; // mid;
            long long cnt=0;
            for(auto &ele:candies){
                  cnt+=ele/mid;
            }
            if(cnt>=k){
                maxi=max(maxi,mid);
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return maxi;

        return maxi;
    }
};