package by.training.fundamental.task02;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxTest2 {
    @Test
    public void findMax02() {
        int firstNumber = 967;
        int secondNumber = 784;
        int thirdNumber = 564;
        int expectedMax = 967;

        int realMax = Main.findMaxNumber(firstNumber, secondNumber, thirdNumber);
        Assert.assertEquals(expectedMax, realMax);
    }
}
