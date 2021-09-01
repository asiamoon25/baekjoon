package numberOf123;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dp[] = new int[11];

        dp[0] = 0;
        dp[1]=1;
        dp[2] = 2;
        dp[3] = 4;
        for(int j = 4;j<=10;j++){//4부터 반복
            dp[j] = dp[j-3]+dp[j-2]+dp[j-1]; // 점화식
        }
        System.out.println("11이하의 특정 숫자 입력 : ");
        int t= sc.nextInt();
        System.out.println("1,2,3으로 표현한 경우의 수 : "+dp[t]);
    }
}
