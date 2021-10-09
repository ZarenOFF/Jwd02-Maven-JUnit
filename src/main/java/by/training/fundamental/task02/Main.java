package by.training.fundamental.task02;

import java.util.Scanner;

/*Написать программу нахождения суммы большего и меньшего из трех чисел.*/

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber, sum;

        firstNumber = fillVarFromConsole("Enter first number");
        secondNumber = fillVarFromConsole("Enter second number");
        thirdNumber = fillVarFromConsole("Enter third number");

        sum = findSum(firstNumber, secondNumber, thirdNumber);

        showSumOnConsole(sum);
    }

    protected static int enterNumber() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("Try again");
        }
        return scan.nextInt();
    }

    protected static int fillVarFromConsole(String message){
        System.out.println(message);
        return enterNumber();
    }

    protected static int findMaxNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }

    protected static int findMinNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            return firstNumber;
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }

    protected static int findSum (int firstNumber, int secondNumber, int thirdNumber){
        return findMaxNumber(firstNumber, secondNumber, thirdNumber) + findMinNumber(firstNumber, secondNumber, thirdNumber);
    }

    protected static void showSumOnConsole (int sum){
        System.out.println(sum);
    }
}
