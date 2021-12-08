package Medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FirstMissingPositiveTest {

    private FirstMissingPositive firstMissingPositive;

    @BeforeEach
    public void before() {
        firstMissingPositive = new FirstMissingPositive();
    }

    @Test
    void test1() {
        int[] nums = new int[]{1, 2, 3};
        assertThat(firstMissingPositive.solve(nums)).isEqualTo(4);
    }

    @Test
    void test2() {
        int[] nums = new int[]{2};
        assertThat(firstMissingPositive.solve(nums)).isEqualTo(1);
    }
}