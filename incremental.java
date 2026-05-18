import java.util.*;

public class incremental {
    static List<Integer> primes = new ArrayList<>();

    static boolean isPrime(int n) {
        for (int p : primes) {
            if (p * p > n) break;
            if (n % p == 0) return false;
        }
        return true;
    }

    static void generatePrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Generate primes up to n
        generatePrimes(n);
    }
}

