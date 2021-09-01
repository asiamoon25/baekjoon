package oddeven;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int num = sc.nextInt();
        //num이 2로 나누어 떨어지면 짝수 아니면 홀수 삼항연산자로 표현했습니다.
        System.out.println(num%2==0? num+"은 짝수입니다.": num+"은 홀수입니다.");
    }
}
