class Solution {
public:
    int minSteps(string s, string t) {
        map<char,int>mp;
        for(auto &i:s) mp[i]++;
        map<char,int>mp2;
        for(auto &i:t) mp2[i]++;
        int ans=0;
        for(int i=0;i<s.size();i++){
            if(mp[s[i]]>mp2[s[i]])            
            ans+=mp[s[i]]-mp2[s[i]];
            mp[s[i]]=0;
            mp2[s[i]]=0;
        }
        return ans;
    }
};