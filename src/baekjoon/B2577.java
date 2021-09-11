package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        br.close();
        int zero=0;
        int one=0;
        int two =0;
        int three=0;
        int four=0;
        int five=0;
        int six=0;
        int seven =0 ;
        int eight =0;
        int nine=0;
        String kake = String.valueOf(a*b*c);
        char[] arr = new char[kake.length()];
        for(int i=0;i<kake.length();i++){
            arr[i] = kake.charAt(i);
            if(arr[i]=='0'){
                zero++;
            }else if(arr[i]=='1'){
                one++;
            }else if(arr[i]=='2'){
                two++;
            }else if(arr[i]=='3'){
                three++;
            }else if(arr[i]=='4'){
                four++;
            }else if(arr[i] =='5'){
                five++;
            }else if(arr[i]=='6'){
                six++;
            }else if(arr[i]=='7'){
                seven++;
            }else if(arr[i]=='8'){
                eight++;
            }else if(arr[i]=='9'){
                nine++;
            }
        }
        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
    }
}
