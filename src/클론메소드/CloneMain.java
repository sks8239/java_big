package 클론메소드;

public class CloneMain {
    public static void main(String[] args) {
        Member mem1 = new Member("sks8239", "신경섭","tlsrudtjq",25,true);
        Member mem2 = mem1;

        mem2.age = 300;
        mem2.name = "Tiger";

        System.out.println("name : " + mem1.name);
        System.out.println("age : " + mem1.age);

        System.out.println("name : " + mem2.name);
        System.out.println("age : " + mem2.age);
    }
}
