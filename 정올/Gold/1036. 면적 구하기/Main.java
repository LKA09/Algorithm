import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int k = 0; k < count; k++) {

            String s = sc.next();

            long sum = 0;

            long x = 0;
            long y = 0;

            for (int i = 0; i < s.length(); i++) {

                int digit = s.charAt(i) - '0';

                long a = x;
                long b = y;

                if (digit == 8) {

                    a = x;
                    b = y + 1;

                } else if (digit == 2) {

                    a = x;
                    b = y - 1;

                } else if (digit == 6) {

                    a = x + 1;
                    b = y;

                } else if (digit == 4) {

                    a = x - 1;
                    b = y;

                } else if (digit == 9) {

                    a = x + 1;
                    b = y + 1;

                } else if (digit == 7) {

                    a = x - 1;
                    b = y + 1;

                } else if (digit == 3) {

                    a = x + 1;
                    b = y - 1;

                } else if (digit == 1) {

                    a = x - 1;
                    b = y - 1;

                } else if (digit == 5) {
                    break;
                }

                sum += x * b - y * a;

                x = a;
                y = b;
            }

            long absSum = Math.abs(sum);

            if (absSum % 2 == 0) {
                System.out.println(absSum / 2);
            } else {
                System.out.println(absSum / 2.0);
            }
        }
    }
}