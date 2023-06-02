package main.part.com.selfstudy.javastudy.condition;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if(score >= 90) {
            System.out.println("점수 90보다 큼");
        } else if(score >= 80) {
            System.out.println("점수 80 - 89임");
        } else if(score >= 70) {
            System.out.println("점수 70 - 79임");
        } else {
            System.out.println("점수 70 미만임");
        }
    }
}
