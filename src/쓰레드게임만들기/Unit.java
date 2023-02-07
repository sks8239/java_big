package 쓰레드게임만들기;

abstract class Unit {
    protected String name; // 캐릭터 이름 설정
    protected int pPower; // 피지컬 Power (물리적인 힘)
    protected int mPower; // 매지컬 Power (마법의 힘)
    protected double pHit; // 물리 적중률
    protected double mHit; // 마법 적중률
    protected int ultraPower; // 궁극기 (해당 캐릭터가 가진 특수 능력)
    protected int hp; // 체력
}
// 실제 기능 구현 없고, 상속 받은 클래스 반드시 해당 메소드를 완성해줘야 함
