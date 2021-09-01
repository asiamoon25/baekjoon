package diceRoll;

import java.util.Scanner;

public class DiceTest {
    public static void main(String[] args) {
        //특정수가 주어진다
        Scanner sc = new Scanner(System.in);
        System.out.println("2~12사이의 수를 적으세요 : ");

        int num = sc.nextInt();

        System.out.println("두 주사위의 조합");
        for(int i =1;i<=6;i++){
            for(int j =1;j<=6;j++){
                if(i+j == num){
                    System.out.println("("+i+","+j+")"+" ");
                }
            }
        }
    }
}
