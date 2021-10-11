package by.training.fundamental.task02;

import org.junit.Assert;
import org.junit.Test;

public class FindMinTest2 {
    @Test
    public void findMin02() {
        int firstNumber = 967;
        int secondNumber = 784;
        int thirdNumber = 564;
        int expectedMin = 564;

        int realMin = LogicController.findMinNumber(firstNumber, secondNumber, thirdNumber);
        Assert.assertEquals(expectedMin, realMin);
    }
}
