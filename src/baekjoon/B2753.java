package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int year = Integer.parseInt(str);

        if(year%4==0&&(year%100!=0 ||year%400==0))
            System.out.println(1);
        else
            System.out.println(0);

    }
}
