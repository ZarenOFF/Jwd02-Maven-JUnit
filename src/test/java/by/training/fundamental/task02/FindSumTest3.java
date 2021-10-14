package by.training.fundamental.task02;

import org.junit.Assert;
import org.junit.Test;

public class FindSumTest3 {
    @Test
    public void findSum03() {
        int firstNumber = 0;
        int secondNumber = 594;
        int thirdNumber = 0;
        int expectedSum = 594;

        MathProblem mathProblem = new MathProblem(firstNumber, secondNumber, thirdNumber);
        int realSum = mathProblem.calculateSum();

        Assert.assertEquals(expectedSum, realSum);
    }
}
