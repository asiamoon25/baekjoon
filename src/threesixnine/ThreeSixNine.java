package threesixnine;

public class ThreeSixNine {



    public static void main(String[] args) {
        //랜덤으로 끝나는 횟수 랜덤지정
        int end_count = (int)(Math.random()*1000+1);
        System.out.println("End Count : "+end_count);
        //박수친 횟수
        int clap_count = 0;

        for(int i =1; i<=end_count;i++){
            //String으로 형변환
            String src = String.valueOf(i);
            //각 자리수 3,6,9 유뮤 확인
            for(int j=0;j<=src.length()-1;j++){
                if(src.charAt(j)=='3'||src.charAt(j)=='6'||src.charAt(j)=='9'){
                    clap_count++;
                }
            }
        }
        //출력
        System.out.println("Clap Count : "+clap_count);


    }

}
