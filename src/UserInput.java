import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public int askUserInput() {
        System.out.print("Enter menu number: ");
        return scanner.nextInt();
    }
}
