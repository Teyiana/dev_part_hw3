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
     void testThatSumWorksCorrect() {
        //When
        int actual = sumCalc.sum(3);
        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumWorksDoesNotCorrect() {
        //When
        int actual = sumCalc.sum(4);

        //Then
        int expected = 11;
        Assertions.assertNotEquals(expected, actual);
    }

}
