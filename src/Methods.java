import java.util.*;

public class Methods {

    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        //pre-order traversal
        //System.out.println(root.val);

        dfs(root.left);

        //in-order traversal
        System.out.println(root.val);

        dfs(root.right);

        //post-order traversal
        //System.out.println(root.val);
    }

    public void bfs(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){

            TreeNode node = q.poll();

            //level-order traversal
            System.out.println(node.val);

            if(node.left != null){
                q.add(node.left);
            }
            if(node.right != null){
                q.add(node.right);
            }
        }
    }

    //dfs no recursion in-order traversal
    public void dfs1(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        Set<TreeNode> visited = new HashSet<>();

        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.peek();

            while(node.left != null && !visited.contains(node.left)){
                stack.push(node.left);
                node = node.left;
            }

            stack.pop();
            visited.add(node);
            System.out.println(node.val);

            if(node.right != null){
                stack.push(node.right);
            }
        }
    }

    //dfs no recursion pre-order traversal
    public void dfs2(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        Set<TreeNode> visited = new HashSet<>();

        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();

            visited.add(node);
            System.out.println(node.val);

            if(node.right != null && !visited.contains(node.right)){
                stack.push(node.right);
            }

            if(node.left != null && !visited.contains(node.left)){
                stack.push(node.left);
            }
        }
    }

    //dfs no recursion post-order traversal
    public void dfs3(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        Set<TreeNode> visited = new HashSet<>();

        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.peek();

            if((node.left == null || visited.contains(node.left)) && (node.right == null || visited.contains(node.right))){
                stack.pop();
                visited.add(node);
                System.out.println(node.val);
            }

            if(node.right != null && !visited.contains(node.right)){
                stack.push(node.right);
            }

            if(node.left != null && !visited.contains(node.left)){
                stack.push(node.left);
            }
        }
    }
}
