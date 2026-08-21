import java.util.Scanner;

public class 서로소 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            long n = sc.nextLong();

            if (n == 0) {
                break;
            }

            System.out.println(eulerPhi(n));
        }

        sc.close();
    }

    public static long eulerPhi(long n) {
        long result = n;

        for (long p = 2; p * p <= n; p++) {
            if (n % p == 0) {
                while (n % p == 0) {
                    n /= p;
                }
                result -= result / p;
            }
        }

        if (n > 1) {
            result -= result / n;
        }

        return result;
    }
}