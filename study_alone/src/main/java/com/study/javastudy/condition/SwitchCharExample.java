package main.part.com.selfstudy.javastudy.condition;

public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'B';

        switch(grade) {
            case 'A':
                System.out.println("우수 회원");
                break;
            case 'B':
                System.out.println("일반 회원");
                break;
            default:
                System.out.println("손님");
        }
    }
}
