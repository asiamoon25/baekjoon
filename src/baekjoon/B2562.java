package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for(int i =0;i<=8;i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
        int max = 0;
        int index = 0;
        for(int i=0;i<=8;i++){
            if(max<arr[i]){
                max = arr[i];
                index = i+1;
            }

        }
        System.out.println(max);
        System.out.println(index);
    }
}
