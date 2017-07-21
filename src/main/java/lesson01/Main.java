package lesson01;

import lesson01.controller.Controller;
import lesson01.model.Model;
import lesson01.view.View;

public class Main {

    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);

        controller.createHelloWorld();
    }
}
