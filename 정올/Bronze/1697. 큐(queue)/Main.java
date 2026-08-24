import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new ArrayDeque<>();

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String command = sc.next();

            if (command.equals("i")) {
                int number = sc.nextInt();
                queue.offer(number);
            }

            else if (command.equals("o")) {
                if (queue.isEmpty()) {
                    System.out.println("empty");
                } else {
                    System.out.println(queue.poll());
                }
            }

            else if (command.equals("c")) {
                System.out.println(queue.size());
            }
        }

        sc.close();
    }
}