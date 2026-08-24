import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    Scanner sc = new Scanner(System.in);

    Queue<Integer> queue = new ArrayDeque<>();

    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
        String commend = sc.next();
        if (commend == 'i') {
            int number = sc.nextInt();
            queue.offer(number);
        }
        else if (commend == 'o') {
            boolean empty = queue.isEmpty();
            if (empty == true) {
                System.out.println(queue.poll());
            }
        }
        else if (commend == 'c') {
            System.out.println(queue.size());
        }
    }
}