import java.util.Scanner;

public class 게임 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt(); // 사람수
    long b = sc.nextInt(); // 첫번째 숫자
    long c = sc.nextInt(); // 두번째 숫자
    long d = b; //첫번째 숫자 저장
    long e = c; //두번째 숫자 저장
    long count = 0;
    while (b!=c) { // 최대 공약수 구하는 알고리즘
        if (b > c) {
            b -= c;
        }
        else{
            c -= b;
        }
    }
    if ( d > e){
        count = d / b;
    }
    else {
        count = e / b;
    }
    count -= 3;
    count %= a;
    System.out.println(count + 1);
    }
}