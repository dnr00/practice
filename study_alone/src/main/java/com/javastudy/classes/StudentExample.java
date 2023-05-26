package main.java.com.javastudy.classes;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2  = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");

        /**예제에서는 이렇게 한 클래스를 라이브러리 겸 실행 클래스로 만들었지만
         * 일반적으로 객체 지향 프로그램에서는 두 클래스를 분리함
         */
    }
}
