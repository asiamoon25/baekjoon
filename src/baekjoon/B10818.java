package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int N = Integer.parseInt(str);

        int[] arr = new int[N];
        int index = 0;
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
       while(st.hasMoreTokens()){
           arr[index] = Integer.parseInt(st.nextToken());
           index++;
       }

        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[arr.length-1]);
    }
}
