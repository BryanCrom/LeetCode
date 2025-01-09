import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void LeetCodeTest() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(6, null, new TreeNode(7)));
        TreeNode answer = new TreeNode(5, new TreeNode(4, new TreeNode(2), null), new TreeNode(6, null, new TreeNode(7)));
        assertEquals(answer, solution.deleteNode(root, 3));
    }
}