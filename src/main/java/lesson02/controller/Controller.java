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
        view.printMessage(view.INPUT_NUMBER + model.MIN_NUMBER + ".." + model.MAX_NUMBER);
        while (scanner.hasNext()) {
            if (scanner.next().equalsIgnoreCase(View.STOP_WORD))
                break;
            view.printMessage(model.toString());
            if (checkInputType(scanner)) {
                int number = scanner.nextInt();
                if (isInRange(number, model.getMinNumber(), model.getMaxNumber())) {
                    doInRange(number, isInRange(number, model.getMinNumber(), model.getMaxNumber()), scanner);
                }
                else {
                    break;
                }
            }
        }
        view.printMessage(model.toString());
    }

    private void doInRange(int number, boolean isInRange, Scanner scanner) {
        if (isInRange) {
            if (isInStatistics(number)) {
                view.printMessage(view.ERROR_INPUTTED_BEFORE);
                view.printMessage(model.toString());
            }
            else {
                model.addToStatistics(number);
            }
            model.changeBorder(number);
            checkAnswer(number, model.getSecretNumber());
            model.setAnswer(number);
        }
        else {
            view.printMessage(view.ERROR_OUT_OF_RANGE);
        }
    }

    private boolean checkInputType(Scanner scanner) {
        if (!scanner.hasNextInt()) {
            view.printMessage(view.ERROR_TYPE);
            view.printMessage(view.INPUT_NUMBER + model.getMinNumber() + ".." + model.getMaxNumber());
            scanner.next();
            return true;
        }
        return false;
    }

    private boolean isInRange(int number, int minNumber, int maxNumber) {
        return (number > minNumber && number < maxNumber);
    }

    private boolean isInStatistics(int number) {
        return model.getStatistics().contains(number);
    }

    private void checkAnswer(int answer, int secret) {
        if (secret == answer) {
            view.printMessage(View.CONCRATULATION);
        }
        else {
            if (secret > answer)
                view.printMessage(View.ON_HIGHER + model.getMinNumber() + ".." + model.getMaxNumber());
            else
                view.printMessage(View.ON_LOWER + model.getMinNumber() + ".." + model.getMaxNumber());
        }
    }
}
