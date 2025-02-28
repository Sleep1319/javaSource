package loop;

public class ForEx2 {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];

        int num = 1;
        int row = 0, col = 0;
        int direction = 0;
        int[] dRow = {0, 1, 0, -1};
        int[] dCol = {1, 0, -1, 0};

        for (int i = 0; i < n * n; i++) {
            arr[row][col] = num++;
         
            int nextRow = row + dRow[direction];
            int nextCol = col + dCol[direction];

            // range out and aready value is turn
            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n || arr[nextRow][nextCol] != 0) {
                direction = (direction + 1) % 4;
                nextRow = row + dRow[direction];
                nextCol = col + dCol[direction];
            }

            row = nextRow;
            col = nextCol;
        }

        // arr out
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
