import java.util.InputMismatchException;
import java.util.Scanner;

class E07 {
    public static void main(String[] args) {
        System.out.println("Which multiplicand multiplication table to show?");
        try {
            Scanner scanner = new Scanner(System.in);
            double multiplicand = scanner.nextDouble();
            System.out.println("Until which multiplier?");
            int multiplier = scanner.nextInt();
            if (multiplier > 1) {
                multiplication(multiplicand,multiplier);
            } else {
                System.out.println("multiplier must be higher than 1");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input a number value!");
        }
    }
    public static void multiplication(double multiplicand, int multiplier) {
        for (int i = 1; i <= multiplier; i++) {
            System.out.printf("%.0f x %d = %.0f\n", multiplicand, multiplier, multiplicand * multiplier);
        }
    }
}