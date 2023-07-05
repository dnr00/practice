package main.java.com.study.javastudy.extend;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("홍길동", "123456-1354561", 1);
        System.out.println("name : " + student.name); //부모 상속
        System.out.println("ssn : " + student.ssn); //부모 상속
        System.out.println("studentNo : " + student.studentNo);
    }
}
