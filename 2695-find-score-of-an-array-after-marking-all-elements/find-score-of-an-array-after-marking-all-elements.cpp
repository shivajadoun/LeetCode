class Solution {
public:
    long long findScore(vector<int>& nums) {
       
        vector<pair<int,int>>pr;
        for(int i=0;i<nums.size();++i) pr.push_back({nums[i],i});
        // sort(begin(pr),end(pr));
        vector<bool>mark(nums.size(),false);
        priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>>pq;
        for(auto  &i:pr) pq.push({i.first,i.second});
        long long sum=0;
        // 1- 1
        // 2 -0
        // 2 -5
        // 3 -2
        // 3 -3
        // 5 -4
        while(!pq.empty()){
            int idx=pq.top().second;
            if(mark[idx]) {
                pq.pop();
                continue;
            }
            // cout<<pq.top().first<<" "<<idx<<" \n";
            sum+=pq.top().first;
            pq.pop();
            if(idx-1>=0) mark[idx-1]=true;
            if(idx+1<nums.size()) mark[idx+1]=true;
            mark[idx]=true;
        }
        return sum;
    }
};