import java.util.*;

class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {

        //base case if null
        if (root == null){
            return null;
        }

        //traverse to the right if key is greater
        if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        //traverse left if key is lesser
        else if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else{
            //if node to be deleted has 0 or 1 children
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //if node to be deleted has 2 children
            else{

                //find in-order successor
                TreeNode successor = root.right;
                while(successor.left != null){
                    successor = successor.left;
                }

                //assign successor value to node to be deleted
                root.val = successor.val;

                //delete successor node
                root.right = deleteNode(root.right, successor.val);
            }
        }

        return root;
    }
}