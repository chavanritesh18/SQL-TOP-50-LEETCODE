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
    public List<Double> averageOfLevels(TreeNode root) {
         ArrayList<Double> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
            return result;
        if (root != null)
            q.add(root);
        while (!q.isEmpty()) {
            int level = q.size();
            double avg = 0;
            for (int i = 0; i < level; i++) {
                if (q.peek().left != null)
                    q.add(q.peek().left);
                if (q.peek().right != null)
                    q.add(q.peek().right);
                avg = avg + q.peek().val;
                q.remove();
            }
            avg = avg / (double)level;
            result.add(avg);
        }
        return result;
    }
}