package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int num = Integer.parseInt(s);

        StringTokenizer st;
        for(int i = num;i>=1;i--){
            st = new StringTokenizer(i + " ");
            bw.write(Integer.parseInt(st.nextToken())+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
