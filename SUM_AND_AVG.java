import java.util.Scanner;

public class SUM_AND_AVG {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            int[] array = new int[n];
            int sum = 0;

            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
                sum += array[i];
            }

            double average = (double) sum / n;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        }
    }
}