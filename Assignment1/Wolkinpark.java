
//package DSA-problem-solving.Assignment1;
import java.util.Scanner;

public class Wolkinpark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            char[][] grid = new char[n][m];
            boolean[][] visited = new boolean[n][m];

            for (int j = 0; j < n; j++) {
                String row = scanner.next();
                grid[j] = row.toCharArray();
            }

            System.out.println(countSteps(grid, visited));
        }
        scanner.close();
    }

    private static int countSteps(char[][] grid, boolean[][] visited) {
        int steps = 0;
        int x = 0, y = 0;

        while (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && !visited[x][y]) {
            visited[x][y] = true;
            char direction = grid[x][y];

            switch (direction) {
                case 'U':
                    x--;
                    break;
                case 'D':
                    x++;
                    break;
                case 'L':
                    y--;
                    break;
                case 'R':
                    y++;
                    break;
            }

            steps++;
        }

        return steps;
    }

}
