import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void LeetCodeTest() {
        Solution solution = new Solution();
        int n = 6;
        int[][] connections = new int[][]{{0,1},{1,3},{2,3},{4,0},{4,5}};
        assertEquals(3, solution.minReorder(n, connections));
    }
}