import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] a = new int[K];

        for (int i = 0; i < K; i++) {
            a[i] = sc.nextInt();
        }

        int i;

        for (i = K - 1; i >= 0; i--) {
            int max = N - K + i + 1;

            if (a[i] < max) {
                break;
            }
        }

        if (i < 0) {
            System.out.println("NONE");
            return;
        }

        a[i]++;

        for (int j = i + 1; j < K; j++) {
            a[j] = a[j - 1] + 1;
        }

        for (int j = 0; j < K; j++) {
            System.out.print(a[j]);

            if (j != K - 1) {
                System.out.print(" ");
            }
        }
    }
}