package 회원정보종합예제;

public class MemberMain {
    public static void main(String[] args){
        MemberInfo memberInfo = new MemberInfo(); // MemberInfo 클래스를 객체로 만듦(인스턴스화)
        memberInfo.setName();
        memberInfo.setAge();
        memberInfo.setGender();
        memberInfo.setJobs();
    }
}
