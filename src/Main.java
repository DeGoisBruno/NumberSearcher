import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Choose a number: ");
        int input = userInput.nextInt();
        boolean exist = false;

        for(int storedNum : numbers) {
            if (storedNum == input) {
                System.out.println("Number " + input + " has been found.");
                exist = true;
                break;
            }
        }
        if (!exist) {
            System.out.println("Number " + input + " has NOT been found!");
        }
        userInput.close();
    }
}