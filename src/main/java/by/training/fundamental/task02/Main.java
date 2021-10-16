package by.training.fundamental.task02;

/*Написать программу нахождения суммы большего и меньшего из трех чисел.*/

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber, sum;

        OutputController.displayOnConsole("Enter first number");
        firstNumber = InputController.enterNumberFromConsole();
        OutputController.displayOnConsole("Enter second number");
        secondNumber = InputController.enterNumberFromConsole();
        OutputController.displayOnConsole("Enter third number");
        thirdNumber = InputController.enterNumberFromConsole();

        MathProblem mathProblem = new MathProblem(firstNumber, secondNumber, thirdNumber);
        sum = mathProblem.calculateSum();

        OutputController.displayOnConsole("Sum = " + sum);
    }
}
