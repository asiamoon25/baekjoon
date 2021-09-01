package numberOf123;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        //입력받은 정수 N의 최대 값이 10이므로 배열의 크기는 10+1로 생성한다.
        int[] arr = new int[11];

        arr[0] = 1; //기본값으로 가지고 있는 것 출력되지 않은 인덱스.

        for(int i=1;i<10;i++){
            //1이 마지막인것
            if(i-1>=0)
                arr[i] += arr[i-1];
            //2가 마지막인것
            if(i-2 >= 0){
                arr[i] += arr[i-2];
            }
            //3이 마지막인것
            if(i-3>=0){
                arr[i] += arr[i-3];
            }
        }
        for(int i =0;i<cnt;i++){
            int num = sc.nextInt();
            System.out.println(arr[num]);
        }

/*순환식 : d[n] = d[n-1]+d[n-2]+d[n-3]  구하다 보면 이렇게 된다.*/

    }
}
