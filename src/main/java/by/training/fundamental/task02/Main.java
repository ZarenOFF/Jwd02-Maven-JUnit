package by.training.fundamental.task02;

import java.util.Scanner;

/*Написать программу нахождения суммы большего и меньшего из трех чисел.*/

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber, sum;

        firstNumber = InputController.fillVarFromConsole("Enter first number");
        secondNumber = InputController.fillVarFromConsole("Enter second number");
        thirdNumber = InputController.fillVarFromConsole("Enter third number");

        sum = LogicController.calculateSum(firstNumber, secondNumber, thirdNumber);

        OutputController.displaySumOnConsole(sum);
    }
}
