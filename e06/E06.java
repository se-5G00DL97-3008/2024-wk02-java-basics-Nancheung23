import java.util.InputMismatchException;
import java.util.Scanner;

class E06 {
    public static void main(String[] args) {
        System.out.println("Which multiplication table to show?");
        try {
            Scanner scanner = new Scanner(System.in);
            multiplication(scanner.nextDouble());
        } catch (InputMismatchException e) {
            System.out.println("Input a number");
        }
    }

    public static void multiplication(double number) {
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d x %.0f = %.0f\n", i, number,i * number);
        }
    }
}