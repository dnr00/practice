package main.java.com.javastudy.exception;

public class MyExceptionExample {
    public static void main(String[] args) {

        try {
            String stringInteger = "not number";
            int integer = Integer.parseInt(stringInteger);
        } catch (Exception e) {
            System.out.println("오류 발생");
            System.out.println("오류 메시지 : " + e);
        }
    }
}
