package array;

public class Q1351 {

    public int countNegatives(int[][] grid) {

        int total = 0;
        for (int x = grid.length - 1; x >= 0; x--) {
            for (int y = grid[x].length - 1; y >= 0; y--) {
                if (grid[x][y] < 0) {
                    total++;
                } else {
                    break;
                }
            }
        }
        return total;
    }
}
