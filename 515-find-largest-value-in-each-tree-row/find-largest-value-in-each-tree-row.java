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
    
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>ll=new ArrayList<>();
         if(root==null)return ll;
         Queue<TreeNode>qq=new LinkedList<>();
         qq.add(root);
         while(!qq.isEmpty()){
            int size=qq.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
            TreeNode temp=qq.poll();
            max=Math.max(max,temp.val);
              if(temp.left!=null)qq.add(temp.left);
              if(temp.right!=null)qq.add(temp.right);

            }
            ll.add(max);

         }
         return ll;
    }
}
