package 상속실습예제;

public class InheritanceEx1 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setAge(25);
        worker.setSleep(6);
        worker.setWork(6);
        System.out.println("직장인이 " + worker.getWork() + "시간동안 일을 합니다.");
    }
}
