package lesson02.controller;

import lesson02.model.Model;
import lesson02.view.View;

import java.util.Scanner;

/**
 * Created by denglob on 7/21/17.
 */
public class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void game() {
        Scanner scanner = new Scanner(System.in);
        model.rand(model.getMinNumber(), model.getMaxNumber());
        getNumberFromScanner(scanner);
    }

    private void getNumberFromScanner(Scanner scanner) {
        view.printMessage(view.INPUT_NUMBER + model.getMinNumber() + ".." + model.getMaxNumber());
        while (!scanner.hasNext()) {
            doOnType(scanner, checkInputType(scanner));
        }
        int input = scanner.nextInt();
        model.addToStatistics(input);
        model.setAnswer(input);
        view.printMessage(model.toString());
    }

    private void doOnType(Scanner scanner, boolean isCorrectType) {
        if (isCorrectType) {
            int number = scanner.nextInt();
            doInRange(number, model.isInRange(number, model.getMinNumber(), model.getMaxNumber()));
        }
        else {
            view.printMessage(view.ERROR_TYPE);
            view.printMessage(view.INPUT_NUMBER + model.getMinNumber() + ".." + model.getMaxNumber());
            scanner.next();
        }
    }

    private void doInRange(int number, boolean isInRange) {
        if (isInRange) {
            if (model.isInStatistics(number)) {
                view.printMessage(view.ERROR_INPUTTED_BEFORE);
                view.printMessage(model.toString());
            }
            else {
                model.addToStatistics(number);
            }
            model.changeMinNumber(number);
            model.changeMaxNumber(number);
        }
        else {
            view.printMessage(view.ERROR_OUT_OF_RANGE);
        }
    }

    private boolean checkInputType(Scanner scanner) {
        return scanner.hasNextInt();
    }
}
