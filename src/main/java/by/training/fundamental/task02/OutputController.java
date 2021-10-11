package by.training.fundamental.task02;

public class OutputController {
    public static final String SUM_MESSAGE = "Sum = ";

    public static void displaySumOnConsole(int sum) {
        displayMessageOnConsole(SUM_MESSAGE, sum);
    }

    public static void displayMessageOnConsole(String message) {
        System.out.println(message);
    }

    public static void displayMessageOnConsole(int number) {
        System.out.println(Integer.toString(number));
    }

    public static void displayMessageOnConsole(String message, int number) {
        System.out.println(message + Integer.toString(number));
    }
}
