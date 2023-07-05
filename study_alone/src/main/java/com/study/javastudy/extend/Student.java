package main.java.com.study.javastudy.extend;

public class Student extends People{
    public int studentNo;

    public Student(String name, String ssn, int studentNo) {
        super(name, ssn); //People 클래스의 생성자 호출
        this.studentNo = studentNo;
    }
}
