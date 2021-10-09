package by.training.fundamental.task02;

import org.junit.Assert;
import org.junit.Test;

public class FindMinTest1 {
    @Test
    public void findMin01() {
        int firstNumber = 1;
        int secondNumber = 10;
        int thirdNumber = 50;
        int expectedMin = 1;

        int realMin = Main.findMinNumber(firstNumber, secondNumber, thirdNumber);
        Assert.assertEquals(expectedMin, realMin);
    }
}
