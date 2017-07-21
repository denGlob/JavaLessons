package lesson02;

import lesson02.controller.Controller;
import lesson02.model.Model;
import lesson02.view.View;

/**
 * Created by denglob on 7/21/17.
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(model, view);
        controller.game();
    }
}
