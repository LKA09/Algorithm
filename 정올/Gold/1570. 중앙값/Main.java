import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());

        PriorityQueue<Integer> right = new PriorityQueue<>();

        for (int i = 0; i < N / 2 + 1; i++) {

            if (i == 0) {
                int a = sc.nextInt();

                left.add(a);

                System.out.println(left.peek());
            } else {
                int a = sc.nextInt();
                int b = sc.nextInt();

                addNumber(a, left, right);
                addNumber(b, left, right);

                System.out.println(left.peek());
            }
        }
    }

    static void addNumber(
            int value,
            PriorityQueue<Integer> left,
            PriorityQueue<Integer> right
    ) {
        if (left.isEmpty() || value <= left.peek()) {
            left.add(value);
        } else {
            right.add(value);
        }

        // left가 right보다 항상 1개 많도록 맞춤
        if (left.size() > right.size() + 1) {
            right.add(left.poll());
        } else if (left.size() < right.size()) {
            left.add(right.poll());
        }
    }
}