package baekjoon;


import java.io.*;
import java.util.StringTokenizer;

public class B10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];

        for(int i =0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]<x){
                bw.write(arr[i]);
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }
}
