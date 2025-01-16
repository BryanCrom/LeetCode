import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void LeetCodeTest() {
        Solution solution = new Solution();
        int[][] cities = new int[][]{{1,0,0},{0,1,0},{0,0,1}};
        assertEquals(3, solution.findCircleNum(cities));
    }
}