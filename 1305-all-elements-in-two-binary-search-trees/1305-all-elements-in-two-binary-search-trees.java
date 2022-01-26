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
    
    List<Integer> list = new ArrayList<>();
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        populate(root1);
        populate(root2);
        Collections.sort(list);
        return list;
    }
    
    
    public void populate(TreeNode root){
        if(root == null) return;
        
        list.add(root.val);
        populate(root.right);
        populate(root.left);
        
    }
    
    
}