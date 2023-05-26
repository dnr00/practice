package main.part.com.javastudy;

public class SingOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);

        byte b = 100;
        //byte result3 = -b; -> 부호 연산의 결과값은 int이기 때문에 컴파일 에러 발생
        int result3 = -b;
        System.out.println("result3=" + result3);
    }
}
