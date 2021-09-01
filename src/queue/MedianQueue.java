package queue;

import java.util.*;

public class MedianQueue {

   static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {

            //1에서 10만까지의 자연수가 처음부터 주어진다.
        Integer num = (int)(Math.random()*100000+1);
        Scanner sc = new Scanner(System.in);

        while(num>=1){
            System.out.println("명령어 입력");
            String src = sc.next();

            switch (src){
                //데이터 x를 큐에 삽입 후 중앙값
                case "PUSH" :
                    System.out.println("넣을 정수 값 : ");
                    int dataX = sc.nextInt();
                    System.out.println(push(dataX));
                    break;
                //현재 큐에 저장된 데이터들 중 중앙값을 큐에서 삭제후
                //새롭게 중앙값으로 선택된 데이터를 출력한다.
                case "POP":
                    System.out.println(pop()==0? "NO ITEM" : pop());
                    break;
                //현재 큐에 저장된 데이터의 수를 출력
                case "SIZE" :
                    System.out.println("size : "+size());
                    break;
            }
            num--;
        }
    }
    public static int pop(){
        Integer median = findMedian();
        list.remove(median);
        if(list.size()==0){
            return 0;
        }else {
            int newMedian = findMedian();
            return newMedian;
        }
    }
    //현재 저장된 데이터의 수
    public static int size(){
        return list.size();
    }

    public static int push(int dataX){
        list.add(dataX);
        return findMedian();
    }
    public static int findMedian() {
        if (list.size() == 1) {
            return list.get(0);
        } else {
            if (list.size() % 2 == 0) {
                list.sort(null);
                int medianIndex = (1 + list.size()) / 2;
                return list.get(medianIndex);
            } else {
                list.sort(Comparator.reverseOrder());
                int medianIndex = (2 + list.size()) / 2;
                return list.get(medianIndex);
            }
        }
    }

}
