package by.training.fundamental.task02;

/*Написать программу нахождения суммы большего и меньшего из трех чисел.*/

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber, sum;

        firstNumber = InputController.enterNumberFromConsole();
        secondNumber = InputController.enterNumberFromConsole();
        thirdNumber = InputController.enterNumberFromConsole();

        MathProblem mathProblem = new MathProblem(firstNumber, secondNumber, thirdNumber);
        sum = mathProblem.calculateSum();

        OutputController.displayOnConsole("Sum = " + sum);
    }
}
