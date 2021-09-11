package baekjoon;

import java.io.*;

public class B1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        int temp = num;
        int count = 0;
        boolean b = true;
        while(b){
            int right = temp%10;//10으로 나눈 나머지  오른쪽 1의 자리
            int left = temp/10;//10으로 나눈 몫 왼쪽의 10의자리
            temp = right*10+(right+left)%10;
            count++;
            if(num == temp){
                b= false;
            }
        }
        String count1 = String.valueOf(count);
        br.close();
        bw.write(count1);
        bw.flush();
        bw.close();
    }
}
