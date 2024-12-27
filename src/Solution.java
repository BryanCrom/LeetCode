import java.util.*;

class Solution {
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;

        Queue<TreeNode> q = new LinkedList<>();
        int maxLevel = 1;
        int level = 1;
        q.add(root);

        while(!q.isEmpty()) {

            int levelSize = q.size();
            int runningSum = 0;

            for(int i = 0; i < levelSize; i++) {

                TreeNode node = q.poll();

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }

                runningSum += node.val;

            }

            if(runningSum > max) {
                max = runningSum;
                maxLevel = level;
            }

            level++;
        }
        return maxLevel;
    }
}