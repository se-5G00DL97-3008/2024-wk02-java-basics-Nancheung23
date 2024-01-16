import java.util.InputMismatchException;
import java.util.Scanner;

class E05 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        try {
            Scanner scanner = new Scanner(System.in);
            int day = scanner.nextInt();
            switch (day) {
                case 1: {
                    System.out.println("Monday");
                    break;
                }
                case 2: {
                    System.out.println("Tuesday");
                    break;
                }
                case 3: {
                    System.out.println("Wednesday");
                    break;
                }
                case 4: {
                    System.out.println("Thursday");
                    break;
                }
                case 5: {
                    System.out.println("Friday");
                    break;
                }
                case 6: {
                    System.out.println("Saturday");
                    break;
                }
                case 7: {
                    System.out.println("Sunday");
                    break;
                }
                default: {
                    System.out.println("Only 7 days in a week");
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Input a int value between 1 and 7");
        }
    }
}