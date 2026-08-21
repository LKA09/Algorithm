import java.util.Scanner;

public class 공약수 {
    static long gcd(long a, long b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long G = sc.nextLong();
        long L = sc.nextLong();

        long n = L / G;

        long answerX = 0;
        long answerY = 0;
        long minSum = Long.MAX_VALUE;

        for (long a = 1; a * a <= n; a++) {
            if (n % a == 0) {
                long b = n / a;

                if (gcd(a, b) == 1) {
                    long x = G * a;
                    long y = G * b;

                    if (x + y < minSum) {
                        minSum = x + y;
                        answerX = x;
                        answerY = y;
                    }
                }
            }
        }

        System.out.println(answerX + " " + answerY);
    }
}