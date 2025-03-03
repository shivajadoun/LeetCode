class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        int even=0;
        for(auto &i:nums) if(i%2==0) even++;
        int k=nums.size();
        for(auto &i:nums) nums.push_back(0);
        int j=even+k;
        cout<<k<<" "<<j<<" \n";
        for(int i=0;i<nums.size()/2;++i){
            if(nums[i]%2==0){
                nums[k++]=nums[i];
            }else{
                nums[j++]=nums[i];
            }
        }
        vector<int>ans;
        for(int i=nums.size()/2;i<nums.size();++i) ans.push_back(nums[i]);
        return ans;
    }
};