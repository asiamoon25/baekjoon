package gugudan;

import java.util.Scanner;

public class GuguDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1줄에 표시될 숫자를 입력하세요.");
        int num = sc.nextInt();

        //구구단 현재 가로로 몇개가 쌓였는지
        int count=0;

        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){

                System.out.print("["+i+"*"+j+"="+i*j+"]"+" ");
                count++;
                //만약 입력한 숫자와 현재까지 찍힌 구구단의 개수가 0으로 떨어지면
                //줄바꿈함.
                if(count%num==0){
                    System.out.println();
                }
            }
        }
    }
}
