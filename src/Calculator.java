public class Calculator {
    private UserInput inputGetter;
    private int userChoice;

    private int userInput1;
    private int userInput2;

    public Calculator() {
        inputGetter = new UserInput();
    }
    public void showMenu() {
        Menu.showMenu();
    }

    public void askUserChoice() {
        userChoice = inputGetter.askUserChoice();
    }

    public void askValues(){
        userInput1 = inputGetter.askUserInput();
        userInput2 = inputGetter.askUserInput();
    }

    public void askValues(Integer input1,Integer input2){
        userInput1 = input1;
        userInput2 = input2;
    }

    public int calculate(){
        return userInput1 + userInput2;
    }

}
