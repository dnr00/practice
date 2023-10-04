package main.java.com.study.javastudy2.control.conditional;

import java.util.Scanner;

public class FlowEx2 { //if문에 블럭{} 사용
    public static void main(String[] args) {
        int input;

        System.out.print("숫자를 하나 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine(); // 입력받은 내용을 tmp에 저장
        input = Integer.parseInt(tmp); // 입력받은 문자열(tmp)를 숫자로 변환

        if(input == 0 ) {
            System.out.println("입력한 숫자는 0입니다.");
        }

        if(input != 0 ) 
            System.out.println("입력하신 숫자는 0이 아닙니다.");
            System.out.printf("입력하신 숫자는 %d입니다", input); // 괄호가 없으므로 if문에 속하지 않음

    }
}
