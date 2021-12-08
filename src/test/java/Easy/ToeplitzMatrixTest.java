package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ToeplitzMatrixTest {

    private ToeplitzMatrix toeplitzMatrix;

    @BeforeEach
    public void before() {
        toeplitzMatrix = new ToeplitzMatrix();
    }

    @Test
    void test1() {
        int[][] matrix = new int[][]{{0, 1, 2}, {3, 0, 1}, {4, 3, 0}, {5, 4, 3}};
        assertThat(toeplitzMatrix.solve(matrix)).isEqualTo(true);
    }

    @Test
    void test2() {
        int[][] matrix = new int[][]{{0, 1, 2}, {3, 0, 7}, {4, 3, 0}};
        assertThat(toeplitzMatrix.solve(matrix)).isEqualTo(false);
    }
}