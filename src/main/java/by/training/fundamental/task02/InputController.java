package by.training.fundamental.task02;

import java.util.Scanner;

public class InputController {
    public static final String WRONG_INPUT_INT = "Wrong input format. Integer expected.";

    public static int enterNumberFromConsole() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            scan.nextLine();
            OutputController.displayOnConsole(WRONG_INPUT_INT);
        }
        return scan.nextInt();
    }
}
