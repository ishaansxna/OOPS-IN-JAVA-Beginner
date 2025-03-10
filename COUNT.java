import java.util.Scanner;

public class COUNT {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        }
    }}