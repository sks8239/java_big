package Class클래스;

public class ClassTestEx {
    public static void main(String[] args) {
        String s = new String();
        Class c = s.getClass();
        System.out.println(c);

        Person person = new Person();
        Class pCls = person.getClass();
        System.out.println(pCls.getSimpleName());
        System.out.println(pCls.getClass());
    }
}

class Person{

}