package baekjoon;

import java.io.*;
import java.util.Scanner;

public class B10952 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while(b){
            int num = sc.nextInt();
            int num1 = sc.nextInt();

            if(num==0&&num1==0){
                b = false;
            }else{
                System.out.println(num+num1);
            }
        }


    }
}
