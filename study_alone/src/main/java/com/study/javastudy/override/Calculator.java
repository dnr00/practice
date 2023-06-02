package main.part.com.selfstudy.javastudy.override;

public class Calculator {
    double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.14159 * r * r; //정확한 계산을 위해 3.14159 대신 Math.PI 상수 사용
    }
}
