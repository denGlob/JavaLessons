package lesson01.controller;

import lesson01.model.Model;
import lesson01.view.View;

import java.util.Scanner;

public class Controller {

    //Validation consts
    public static final String FIRST_WORD = "Hello";
    public static final String SECOND_WORD = "world!";

    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void createHelloWorld () {
        Scanner scanner = new Scanner(System.in);

        model.setFirstWord(inputDataViaScanner(scanner, FIRST_WORD, view.INPUT_FIRST_WORD, view.WRONG_INPUT_WORD));
        model.setSecondWord(inputDataViaScanner(scanner, SECOND_WORD, view.INPUT_SECOND_WORD, view.WRONG_INPUT_WORD));

        view.printMessage(View.RESULT_WORD + model.formOutMessage());
    }

    private String inputDataViaScanner(Scanner scanner, String validValue, String userMessage, String errorMessage) {
        view.printMessage(userMessage);
        while (!scanner.hasNext(validValue)) {
            view.printMessage(errorMessage + userMessage);
            scanner.next();
        }
        return scanner.next();
    }


}
