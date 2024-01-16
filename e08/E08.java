import java.util.InputMismatchException;
import java.util.Scanner;

class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Give a number (0 to quit):");
                int nextNumber = scanner.nextInt();
                if (nextNumber == 0) {
                    break;
                } else {
                    if (nextNumber % 2 == 1) {
                        System.out.println("Number is odd");
                    } else if (nextNumber % 2 == 0) {
                        System.out.println("Number is even");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Input an int value! Try again");
            }
        }
    }
}