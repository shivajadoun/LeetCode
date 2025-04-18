class Solution {
public:
    bool isHappy(int n) {
      bool mark=true;
      unordered_set<int>st;
      while(n!=1){
        if(st.find(n)!=st.end()) return false;
        st.insert(n);
        long long ans=0;
        while(n!=0){
            ans+=pow(n%10,2);
            n/=10;
        }
        n=ans;
      }
      return true;
    }
};