package by.training.fundamental.task02;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxTest3 {
    @Test
    public void findMax03() {
        int firstNumber = 203;
        int secondNumber = -842;
        int thirdNumber = 261;
        int expectedMax = 261;

        int realMax = Main.findMaxNumber(firstNumber, secondNumber, thirdNumber);
        Assert.assertEquals(expectedMax, realMax);
    }
}
