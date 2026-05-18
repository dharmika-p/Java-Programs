import java.util.*;
public class fibonacci {
    public static void fibonacci(int n) {
        if (n <= 0) 
            return;
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }
}
