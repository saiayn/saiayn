package HelloWorld;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    // this method scans for input data and sends output to user
    public void processUser(){

        Scanner scannerInput = new Scanner(System.in);
        for (int i = 0; i < (model.searchLength()); i++) {
            model.input(Appropriation(scannerInput));
        }
        view.greetingMessage(View.PROGRAM_OUTPUT, model.output());
    }
    // this method checks whether input is appropriate
    public String Appropriation(Scanner scannerInput) {

        view.message(View.INPUT_REQUEST);

        while(!model.proofer(scannerInput.nextLine())) {

            view.message(View.WRONG_INPUT);
        }
        return model.keyword;
    }
}