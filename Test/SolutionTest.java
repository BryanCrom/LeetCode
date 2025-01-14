import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void LeetCodeTest() {
        Solution solution = new Solution();
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(List.of(1, 3));
        rooms.add(List.of(3, 0, 1));
        rooms.add(List.of(2));
        rooms.add(List.of(0));
        assertEquals(false , solution.canVisitAllRooms(rooms));
    }
}