public class binarymetrix {
    public static void solve(int n, int m, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = 1 - matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
                if (j < m - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
