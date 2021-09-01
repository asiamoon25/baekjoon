package diceRoll;

import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        //특정 수가 주어지면(2~12) 그 수를 두개의 주사위로 표현할 수 있는가 .
        Scanner sc = new Scanner(System.in);
        System.out.println("2~12사이의 숫자를 입력하세요");
        int num = sc.nextInt();// num = 입력한 특정 수


        for(int i = 1; i<=6; i++){ //주사위 1.

            for(int j =1;j<=6;j++){//주사위2
                //만약 주사위1과 주사위2의 합이 입력한 특정수와 같으면
                if(i+j == num){
                    System.out.println("("+i+","+j+")");//주사위 1과 주사위 2의 조합을 나타냄
                }
            }
        }

    }
}
