package 영화표예매;

import java.util.Scanner;

// 현재 좌석 상태를 보여주는 메소드가 필요
// 좌석을 예매하는 메소드가 필요
// 판매된 좌석의 개수를 구해 총 판매 금액을 구하는 메소드가 필요
public class MovieTicket {
    // 극장의 좌석 상태를 표시하는 배열 만들기(총 10개)
    int[] seat = new int[10];
    int ticketPrice;
    // 화면에 선택 가능한 좌석 표시 , 판매된 좌석은 [V], 판매되지 않은 좌석은 [ ]
    MovieTicket(int price) {
        ticketPrice = price;
    }


    void printSeat(){
        // 현재 좌석 상태를 보여주는 메소드 작성
        // 0이면 [ ], 1이면 [V]
        for(int i =0; i<seat.length;i++ ){
            if(seat[i]==0){
                System.out.printf("seat %d번 [ ] ", i+1);
            }else{
                System.out.printf("seat %d번 [V] ", i+1);
            }
        }

    }
    //좌석을 예약하는 메소드
    void selectSeat(){
        // printSeat() 호출해 현재 좌석 상태를 보여 줌
        printSeat();
        // 좌석 번호를 입력 받아서 좌석을 예약하는데 이미 예약된 좌석은 error 문구 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("\n좌석번호를 입력하세요 : ");
        int num = sc.nextInt();
        if(seat[num-1]==1){
            System.out.print("이미 예약된 좌석입니다. error!");
        }else{
            seat[num-1] = 1;
            printSeat();
        }
        // 좌석 예약이 성공하면 다시 printSeat()을 호출해 좌석 상태를 보여줌
    }
    int totalAmount(){
        int seatAmount = 0;
        // 좌석 예약 정보를 가지고 있는 배열을 순회해 예약된 좌석 갯수를 누적
        for(int j=0; j<10; j++){
            if(seat[j]==1){
                seatAmount++;
            }
        }
        ticketPrice = seatAmount * 12000;
        // 좌석 개수와 좌석 당 가격을 곱해서 결과를 반환
        return ticketPrice;
    }
}
