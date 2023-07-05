package main.java.com.study.javastudy.field;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "홍길동");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = "usa";
        //p1.ssn = "654321-7654321"; final 필드로 선언되어 값 재할당 시 컴파일 에러
        p1.name = "홍삼원";
    }
}
