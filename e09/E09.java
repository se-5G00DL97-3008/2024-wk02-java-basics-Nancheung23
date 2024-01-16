import java.util.Scanner;

class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while (true){
            try {
                System.out.println("Give a test score (-1 to quit):");
                double score = scanner.nextDouble();
                if (score == -1) {
                    break;
                } else {
                    if (score < 0 || score > 100) {
                        System.out.println("Input a score in reasonable range! (0 - 100)");
                    } else {
                        count ++;
                        sum += score;
                        System.out.printf("Average: %.1f\n",sum/count);
                    }
                }
            } catch (Exception e) {
                System.out.println("Input a score!");
            }
        }
    }
}