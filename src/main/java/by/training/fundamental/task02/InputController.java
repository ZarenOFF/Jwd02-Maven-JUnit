package by.training.fundamental.task02;

import java.util.Scanner;

public class InputController {
    public static final String WRONG_INPUT_INT = "Wrong input format. Integer expected.";

    public static int enterNumberFromConsole() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            scan.nextLine();
            OutputController.displayMessageOnConsole(WRONG_INPUT_INT);
        }
        return scan.nextInt();
    }

    public static int fillVarFromConsole() {
        return enterNumberFromConsole();
    }

    public static int fillVarFromConsole(String messageOnConsole) {
        OutputController.displayMessageOnConsole(messageOnConsole);
        return enterNumberFromConsole();
    }
}
