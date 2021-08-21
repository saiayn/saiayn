package HelloWorld;

public class View {
    // UI constants
    public static final String INPUT_REQUEST  = "You have to enter \"Hello\" and \"World!\"one by one, other inputs are going to be considered as WRONG.\n>>>> ";
    public static final String WRONG_INPUT = "Wrong input type! Try once again.\n>>>> ";
    public static final String PROGRAM_OUTPUT = "Hurrah! You successfully entered proper data - ";

    public void message(String message){
        System.out.print(message);
    }

    public void greetingMessage(String message, String output){
        System.out.println(message + output);
    }
}