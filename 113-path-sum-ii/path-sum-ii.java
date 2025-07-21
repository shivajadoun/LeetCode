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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> temp=new ArrayList<>();
        int[] target={0,targetSum};
        find(root,temp,target);
        return ans;
    }
    List<List<Integer>> ans=new ArrayList<>();
    private void find(TreeNode root, List<Integer> temp, int[] target){
        if(root==null)  return;
        temp.add(root.val);
        target[0]+=root.val;
        if(root.left==null && root.right==null){
            if(target[0]==target[1])
                ans.add(new ArrayList<>(temp));
        }else{
            find(root.left,temp,target);
            find(root.right,temp,target);
        }
        temp.remove(temp.size()-1);
        System.out.println(Arrays.toString(target));
        target[0]-=root.val;
    }
}