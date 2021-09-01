package numberOf123;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //입력할 수가 11이하의 양의 정수
        Scanner sc = new Scanner(System.in);

        //경우의 수를 배열로 나타낸다. arr[1] = 1; 처럼 1일때의 경우의 수를 배열에 담는다.
        //이럴 경우 배열은 0~11이여야하므로 배열의 사이즈가 12인 배열을 선언한다.
        int[] arr = new int[12];

        //입력한 수가 1일때
        arr[1] = 1;

        //입력한 수가 2일때
        arr[2] = 2;

        //입력한 수가 3일때
        arr[3] = 4;

        //입력한 수가 4 일때
        arr[4] = 7;

        //규칙 : arr[n] = arr[n-1]+arr[n-2]+arr[n-3];

        for(int i =5;i<=11;i++){
            arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
        }

        System.out.println("11이하의 정수를 입력하세요 :  ");
        int num = sc.nextInt();

        System.out.println("1,2,3의 합으로 나타낸 경우의 수 : "+arr[num]);

    }
}
