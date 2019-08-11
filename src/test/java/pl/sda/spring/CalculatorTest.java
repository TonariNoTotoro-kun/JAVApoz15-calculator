package pl.sda.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sda.spring.operation.OperationType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void shouldReturnFiveForGivenArgumentsOnAdditionOperation() {
        //given
        double arg1 = 2.0;
        double arg2 = 3.0;

        //when
        double actual = calculator.calculate(OperationType.ADDITION, arg1, arg2);

        //then
        Assert.assertEquals(5.0, actual, 0.00000001);
    }

    @Test
    public void shouldReturnCorrectSubtraction(){
        double arg1 = 15.0;
        double arg2 = 5.0;

        double actual = calculator.calculate(OperationType.SUBTRACTION, arg1, arg2);

        Assert.assertEquals(10.0, actual, 0.0000000001);
    }

    @Test
    public void shouldReturnCorrectMultiplication(){
        double arg1 = 7.0;
        double arg2 = 7.0;

        double actual = calculator.calculate(OperationType.MULTIPLICATION, arg1, arg2);

        Assert.assertEquals(49.0, actual, 0.000000000001);
    }
    @Test(expected = RuntimeException.class)
    public void shouldReturnRuntimeExceptionDivisionByZero(){
        double arg1 = 2.0;
        double arg2 = 0;

        calculator.calculate(OperationType.DIVISION, arg1, arg2);
    }
    @Test
    public void shouldReturnCorrectPercentage(){
        double arg1 = 100.0;
        double arg2 = 25.0;

        double actual = calculator.calculate(OperationType.PERCENTAGE, arg1, arg2);

        Assert.assertEquals(25.0, actual, 0.000000001);
    }
    @Test
    public void shouldReturnCorrectPower(){
        double arg1 = 12.0;
        double arg2 = 2.0;

        double actual = calculator.calculate(OperationType.POWER, arg1, arg2);

        Assert.assertEquals(144.0, actual, 0.0000001);
    }
}
