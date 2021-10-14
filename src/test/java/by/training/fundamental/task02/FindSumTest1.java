package by.training.fundamental.task02;

import org.junit.Assert;
import org.junit.Test;

public class FindSumTest1 {
    @Test
    public void findSum01() {
        int firstNumber = -559;
        int secondNumber = 392;
        int thirdNumber = 548;
        int expectedSum = -11;

        MathProblem mathProblem = new MathProblem(firstNumber, secondNumber, thirdNumber);
        int realSum = mathProblem.calculateSum();

        Assert.assertEquals(expectedSum, realSum);
    }
}
