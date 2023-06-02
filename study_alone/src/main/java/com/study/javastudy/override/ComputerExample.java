package main.part.com.selfstudy.javastudy.override;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원면적 : " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원면적 : " + computer.areaCircle(r)); // Math.PI를 사용하여 더 정확한 결과값 출력
    }
}
