import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] numbers = new int[a];

        for (int i = 0; i < a; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length - 1; i++) {

            String lst = "";       

            int min = numbers[i];
            int minIndex = i;

            for (int k = i + 1; k < numbers.length; k++) {

                if (numbers[k] < min) {
                    min = numbers[k];
                    minIndex = k;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;

            for (int t = 0; t < a; t++) {
                lst = lst + String.valueOf(numbers[t]) + " ";
            }
            System.out.println(lst);
        }
    }
}

// 배열을 입력 받은 후 배열의 최소 값 조사 근데 할 때마다 최소 값을 확인하는 것은 i, i - 1, ... , 1 까지 하는 것인데 1은 할 필요가 없음.
// 반복문을 i가 0이면 최소값을 구할 때 [i] 번째부터 하는 거다.
// 반복문이 지날 수록 [i + 1], [i + 2] 이런식으로 줄여나가는 것.