public class Calculator {
    private UserInput inputGetter;
    private int userInput;

    public Calculator() {
        inputGetter = new UserInput();
    }

    public void showMenu() {
        Menu.showMenu();
    }

    public void askMenuInput() {
        userInput = inputGetter.askUserInput();
    }
}
