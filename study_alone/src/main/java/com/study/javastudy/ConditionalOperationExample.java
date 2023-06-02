package main.part.com.selfstudy.javastudy;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 70;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' ); //삼항 연산자 속에 삼항 연산자
        System.out.println(score + "점은 " + grade + "등급입니다.");

        /** for문 사용하면
         * char grade;
         * for(score > 90) {
         *  grade = 'A';
         *  } else {
         *  grade = 'B';
         * } 인데 위처럼 C까지 나오게는 어떻게 하는지 몰?루
         */
    }
}