package ps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

public static Number getArea(List<List<Integer>> list) {
    long sum = 0;

    for (int i = 0; i < list.size(); i++) {
        List<Integer> current = list.get(i);
        List<Integer> next = list.get((i + 1) % list.size());

        long x1 = current.get(0);
        long y1 = current.get(1);

        long x2 = next.get(0);
        long y2 = next.get(1);

        sum += x1 * y2 - y1 * x2;
    }

    long absSum = Math.abs(sum);

    if (absSum % 2 == 0) {
        return absSum / 2;
    } else {
        return absSum / 2.0;
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String s = sc.next();
        ArrayList<List<Integer>> list = new ArrayList<>();


        list.add(List.of(0, 0));

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit == 8) {
                List<Integer> last = list.get(list.size() - 1);

                int a = last.get(0);
                int b = last.get(1) + 1;

                list.add(List.of(a, b));

            } else if (digit == 2) {
                List<Integer> last = list.get(list.size() - 1);

                int a = last.get(0);
                int b = last.get(1) - 1;

                list.add(List.of(a, b));

            } else if (digit == 6) {
                List<Integer> last = list.get(list.size() - 1);

                int a = last.get(0) + 1;
                int b = last.get(1);

                list.add(List.of(a, b));

            } else if (digit == 4) {
                List<Integer> last = list.get(list.size() - 1);

                int a = last.get(0) - 1;
                int b = last.get(1);

                list.add(List.of(a, b));

            } else if (digit == 9) {
                List<Integer> last = list.get(list.size() - 1);

                int a = last.get(0) + 1;
                int b = last.get(1) + 1;

                list.add(List.of(a, b));

            } else if (digit == 7) {
                List<Integer> last = list.get(list.size() - 1);

                int a = last.get(0) - 1;
                int b = last.get(1) + 1;

                list.add(List.of(a, b));

            } else if (digit == 3) {
                List<Integer> last = list.get(list.size() - 1);

                int a = last.get(0) + 1;
                int b = last.get(1) - 1;

                list.add(List.of(a, b));

            } else if (digit == 1) {
                List<Integer> last = list.get(list.size() - 1);

                int a = last.get(0) - 1;
                int b = last.get(1) + 1;

                list.add(List.of(a, b));

            }
        }
        System.out.println(getArea(list));
    }
}
