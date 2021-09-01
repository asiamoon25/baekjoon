package numberOf123;

import java.util.Scanner;

public class N123 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //입력받은 정수N의 최대값이 11이므로 배열의 크기는 11+1로 생성한다.
        int[] arr = new int[12];

        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        arr[4] = 7;

        for(int i =5;i<=11;i++){
         arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
        }
        System.out.println("값 입력 : ");
        int num = sc.nextInt();

        System.out.println("123으로 나타낸 숫자의 경우의 수 : "+arr[num]);
    }
}
