/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer>ll=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        solve(root,0);
        return ll;
    }
   public void solve(TreeNode root,int val){
      if(root==null)return ;
        if(ll.size()==val)  ll.add(root.val);
        solve(root.right,val+1);
        solve(root.left,val+1);
    }
}