package by.training.fundamental.task02;

import org.junit.Assert;
import org.junit.Test;

public class FindSumTest2 {
    @Test
    public void findSum02() {
        int firstNumber = -559;
        int secondNumber = -532;
        int thirdNumber = -319;
        int expectedSum = -878;

        int realSum = Main.findSum(firstNumber, secondNumber, thirdNumber);
        Assert.assertEquals(expectedSum, realSum);
    }
}
