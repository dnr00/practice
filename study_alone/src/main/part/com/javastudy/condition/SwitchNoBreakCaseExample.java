package main.part.com.javastudy.condition;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) + 8;
        System.out.println("[현재 시각: " + time + " 시]");

        switch(time) {
            case 8:
                System.out.println("출근함.");
            case 9:
                System.out.println("회의함.");
            case 10:
                System.out.println("업무봄.");
            default:
                System.out.println("외근나감.");
        }
    }
}
