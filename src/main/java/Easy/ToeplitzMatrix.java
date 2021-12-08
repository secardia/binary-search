package Easy;

public class ToeplitzMatrix {
    public boolean solve(int[][] matrix) {
        if (matrix.length <= 1 || matrix[0].length <= 1) {
            return true;
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i - 1][j - 1] != matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}