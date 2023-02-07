package 쓰레드게임만들기;

public class GameThB extends Thread{
    private Character warrior;
    private Character wizard;

    public GameThB(Character warrior, Character wizard) {
        this.warrior = warrior; //전사
        this.wizard = wizard; //마법사
    }

    @Override
    public void run() {
        int normal; // 일반공격에 대한 확률 구하기
        int special; // 특수 공격에 대한 확률 구하기
        boolean endGame = false; // 게임의 진행 여부 판단하는 플래그
        while(true) { // 해당 쓰레드를 무한 반복하도록 만듬
            try {
                sleep(3300); // 게임의 진행 속도를 맞추기 위함. (3초 대기)
                normal = (int)(Math.random() * 2); // 50% 확률을 구한다.
                special = (int)(Math.random() * 20); // 5% 확률을 구함.
                if(normal == 1) { // normal 은 0/1 만 있음
                    System.out.println("물리 공격 : " + wizard.name + "에게"
                            + warrior.pAttack() + "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.pAttack());
                } else {
                    System.out.println("마법 공격 : " + wizard.name + "에게"
                            + warrior.mAttack() + "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.mAttack());
                }
                if(special == 10) { // 10이라는 값이 나올 확률은 1/20 이다.
                    System.out.println(warrior.name + " 궁극기 발동 !!!, "
                            + wizard.name + "에게" + warrior.ultimate() +
                            "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.ultimate());
                }
                if(endGame) {
                    System.exit(0);
                }

            } catch (InterruptedException e) {
            }
        }
    }
}
