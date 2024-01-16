import java.util.InputMismatchException;
import java.util.Scanner;

class E04 {
    public static void main(String[] args) {
        for (int i = 0; i < 2 ; i ++) {
            System.out.println("Enter a day:");
            try {
                Scanner scanner = new Scanner(System.in);
                int day = scanner.nextInt();
                if (day < 1 || day > 31) {
                    System.out.println("Out of range: 1 - 31");
                } else {
                    System.out.println("Enter a month:");
                    int month = scanner.nextInt();
                    if (month < 1 || month > 12) {
                        System.out.println("Out of range: 1 - 12");
                    } else {
                        if (day == 24 && month == 12) {
                            System.out.println("Merry Christmas");
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Input a int value!");
            }
        }
    }
}