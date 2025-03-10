import java.util.Random;

public class PRIME_NO {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("Random Number: " + randomNumber);
        System.out.println(isPrime(randomNumber) ? "Prime" : "Not Prime");
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}