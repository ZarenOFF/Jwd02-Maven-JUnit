package by.training.fundamental.task02;

public class LogicController {

    public static int findMaxNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }

    public static int findMinNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            return firstNumber;
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }

    public static int calculateSum(int firstNumber, int secondNumber, int thirdNumber) {
        return findMaxNumber(firstNumber, secondNumber, thirdNumber) + findMinNumber(firstNumber, secondNumber, thirdNumber);
    }
}
