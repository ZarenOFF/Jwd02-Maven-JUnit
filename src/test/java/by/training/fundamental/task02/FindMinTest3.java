package by.training.fundamental.task02;

import org.junit.Assert;
import org.junit.Test;

public class FindMinTest3 {
    @Test
    public void findMin03() {
        int firstNumber = 203;
        int secondNumber = -842;
        int thirdNumber = 261;
        int expectedMin = -842;

        int realMin = LogicController.findMinNumber(firstNumber, secondNumber, thirdNumber);
        Assert.assertEquals(expectedMin, realMin);
    }
}
