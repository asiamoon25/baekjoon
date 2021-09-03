package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B2741 {
    //시간 456ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int num = Integer.parseInt(s);

        StringTokenizer st;
        for(int i =1;i<=num;i++){
            st = new StringTokenizer(i+" ");
            bw.write(Integer.parseInt(st.nextToken())+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
//Scanner 시간 1112ms
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        for(int i=1;i<=num;i++){
//            System.out.println(i);
//        }
    }
}
