package by.training.fundamental.task02;

import java.util.Random;

public class MathProblem {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getThirdNumber() {
        return thirdNumber;
    }

    public void setThirdNumber(int thirdNumber) {
        this.thirdNumber = thirdNumber;
    }

    public MathProblem (){
        Random random = new Random();
        this.firstNumber = random.nextInt(100-1);
        this.secondNumber = random.nextInt(100-1);
        this.thirdNumber = random.nextInt(100-1);
    }

    public MathProblem (int firstNumber, int secondNumber, int thirdNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    private int findMaxNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }

    private int findMinNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            return firstNumber;
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }

    public int calculateSum() {
        return findMaxNumber(firstNumber, secondNumber, thirdNumber) + findMinNumber(firstNumber, secondNumber, thirdNumber);
    }

    @Override
    public String toString() {
        return "MathProblem{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", thirdNumber=" + thirdNumber +
                '}';
    }
}
