import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Give a number:");
            double a = scanner.nextDouble();
            System.out.println("Give another number:");
            double b = scanner.nextDouble();
            System.out.printf("%.0f + %.0f = %.0f\n",a,b,addFunc(a,b));
            System.out.printf("%.0f - %.0f = %.0f\n",a,b,subtractFunc(a,b));
            System.out.printf("%.0f x %.0f = %.0f\n",a,b,multipleFunc(a,b));
            System.out.printf("%.0f / %.0f = %.0f\n",a,b,divideFunc(a,b));
        } catch (InputMismatchException e){
            System.out.println("Input number!");
        } catch ( ArithmeticException e) {
            System.out.println("Divisor can not be 0!");
        }
    }

    public static double addFunc(double a, double b) {
        return a + b;
    }
    public static double multipleFunc(double a, double b) {
        return a * b;
    }
    public static double subtractFunc(double a, double b) {
        return a - b;
    }
    public static BigDecimal divideFunc(double a, double b) {
        BigDecimal num1 = new BigDecimal(a);
        BigDecimal num2 = new BigDecimal(b);
        return num1.divide(num2, RoundingMode.HALF_UP);
    }
}