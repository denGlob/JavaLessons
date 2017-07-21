package lesson02.view;

/**
 * Created by denglob on 7/21/17.
 */
public class View {

    public static final String INPUT_NUMBER = "Please, input number in range: ";
    public static final String ON_HIGHER = "Correct number is higher. Please, input: ";
    public static final String ON_LOWER = "Correct number is lower. Please, input: ";

    public static final String ERROR_OUT_OF_RANGE = "Inputted value is out of range. ";
    public static final String ERROR_TYPE = "Input data must be number";
    public static final String ERROR_INPUTTED_BEFORE = "This number was inputted before ";

    public void printMessage(String message) {
        System.out.println(message);
    }
}
