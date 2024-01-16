import java.util.InputMismatchException;
import java.util.Scanner;

class E03 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        try {
            Scanner scanner = new Scanner(System.in);
            double number = scanner.nextDouble();
            if (number == 0) {
                System.out.println("Zero number");
            } else {
                System.out.print(number > 0 ? "Positive number\n" : "Negative number\n");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input a number!");
        }
    }
}