package main.part.com.javastudy.method.callparent;

public class Airplane { // 부모 메소드 호출
    public void land() {
        System.out.println("착륙합니다.");
    }
    public void fly() {
        System.out.println("일반비행합니다.");
    }
    public void takeOff() {
        System.out.println("이륙합니다.");
    }
}
