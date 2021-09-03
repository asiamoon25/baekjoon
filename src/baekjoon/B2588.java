package baekjoon;

import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b= sc.nextInt();

        int one = b%10;
        int two = ((b-one)/10)%10;
        int three = b/100;

        System.out.println(a*one);
        System.out.println(a*two);
        System.out.println(a*three);
        System.out.println(a*b);
    }
}
