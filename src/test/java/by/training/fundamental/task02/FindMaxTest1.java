package by.training.fundamental.task02;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxTest1 {
    @Test
    public void findMax01() {
        int firstNumber = 1;
        int secondNumber = 10;
        int thirdNumber = 50;
        int expectedMax = 50;

        int realMax = LogicController.findMaxNumber(firstNumber, secondNumber, thirdNumber);
        Assert.assertEquals(expectedMax, realMax);
    }
}
