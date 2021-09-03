package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//글 적은거 읽기
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//글 내보내기

        int num = Integer.parseInt(br.readLine());//적은걸 정수형으로 변환

        StringTokenizer st;//스트링 토큰에 담기 위해 선언

        for(int i =0;i<num;i++){//for문 으로 돌린다.
            st= new StringTokenizer(br.readLine(), " ");//토큰에 " " 공백으로 구분을 나눠서 넣는다.
            bw.write((Integer.parseInt(st.nextToken()))+(Integer.parseInt(st.nextToken()))+"\n");//write로 콘솔창에 보여준다. st.next로 토큰에 담긴거 하나하나
        }
        br.close();//reader 닫아준다.

        bw.flush();//wirter에 담긴거 비워줌 줌
        bw.close();//scanner 닫듯이 닫아줌 마지막에
    }
}
