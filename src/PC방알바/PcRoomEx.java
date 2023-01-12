package PC방알바;

import java.util.Scanner;

// 피씨방에 피씨가 100대 있음
// 손님들은 모두 자기가 앉고 싶어 하는 자리가 있음
// 만약 자기가 앉고 싶어하는 자리에 다른 손님이 있으면 거절을 해야하고, 아니면 자리가 사용허가
// 손님의 수 입력 : 3
// 손님이 앉고 싶어 하는 자리 번호 : 1 3 5 => 0 (거절이 일어나지 않음)
// 손님의 수 입력 : 5
// 손님이 앉고 싶어하는 자리 번호 : 1 1 3 3 5 => 2 (거절횟수)
public class PcRoomEx {
    public static void main(String[] args) {
        int[] pc = new int[100];
        int rejectCnt = 0;
        int seatNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("손님의 수를 입력하세요 : ");
        int guest = sc.nextInt();
        System.out.print("앉고 싶은 자리를 입력하세요 : ");
        for (int i = 0; i < guest; i++) {
            seatNum = sc.nextInt();
            if (pc[seatNum - 1] == 1) {
                rejectCnt++;
            } else {
                pc[seatNum - 1] = 1;
            }
        }
        System.out.print("거절 횟수는 " + rejectCnt + "회 입니다.");
    }
}
