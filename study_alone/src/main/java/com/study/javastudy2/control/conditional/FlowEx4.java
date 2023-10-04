package main.java.com.study.javastudy2.control.conditional;

import java.util.Scanner;

public class FlowEx4 { // if-else문 사용
    public static void main(String[] args) {
        int score = 0;      //점수 저장 변수
        char grade = ' ';   //학점 저장 변수. 공백으로 초기화함

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장

        if(score >= 90) {           // 90 이상이면 A
            grade = 'A';
        } else if (score >= 80 ) {  // 80 이상이면 B
            grade = 'B';
        } else if (score >= 70) {   // 70 이상이면 C
            grade = 'C';
        } else {                    // 나머지는 D
            grade = 'D';
        }   // 각 범위에서 이상 + 이하를 다 적어줄 필요가 없음 -> 앞의 if문이 거짓이라는 전제가 깔려있음
        System.out.println("당신의 학점은 " + grade + "입니다.");

    }
}
