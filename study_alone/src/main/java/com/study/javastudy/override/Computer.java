package main.java.com.study.javastudy.override;

public class Computer extends Calculator{
    @Override // 정확하게 재정의했는지 컴파일러가 확인
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
