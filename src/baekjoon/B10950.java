package baekjoon;

import java.util.Scanner;

public class B10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i =1;i<=num;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }

    }
}
