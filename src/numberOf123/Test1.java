package numberOf123;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[12]; //배열은 0 부터 인덱스가 생기므로 0~11인 배열 선언
        

        //1일 경우
        arr[1] = 1;

        //2일 경우
        arr[2] = 2;

        //3일경우
        arr[3] = 4;

        //4일 경우
        arr[4] = 7;

        //여기서 arr 4일 경우의 경우의 수는 arr 1,2,3의 경우의 수를 더한 것과 같다.
        //그래서 나온 식 : arr[n] = arr[n-1]+arr[n-2]+arr[n-3];

        for(int i=5;i<=11;i++){
            arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력  : ");
        int num = sc.nextInt();

        System.out.println("1,2,3으로 나타낼때의 경우의 수 : "+arr[num]);
    }
}
