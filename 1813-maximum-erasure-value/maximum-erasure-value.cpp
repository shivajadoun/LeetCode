class Solution {
public:
    int maximumUniqueSubarray(vector<int>& nums) {
        int i=0;
        int j=0;
        int maxi=0;
        int sum=0;
        map<int,int>mp;
        for(int i=0;i<nums.size();++i){
            while(mp[nums[i]]==1 && i>j){
                mp[nums[j]]--;
                sum-=nums[j];
                j++;
            }
            sum+=nums[i];
            mp[nums[i]]++;
            maxi=max(maxi,sum);
        }
        return maxi;
    }
};