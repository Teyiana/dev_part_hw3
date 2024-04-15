import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator sumCalc;

    @BeforeEach
    public void beforeEach() {
        sumCalc = new SumCalculator();
    }

    @Test
    void testThatSumWorksCorrectWith1() {
        //When
        int actual = sumCalc.sum(1);
        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumWorksCorrect() {
        //When
        int actual = sumCalc.sum(3);
        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumWorksDoesNotCorrect() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalc.sum(0));
    }

}
