package main.java.com.study.javastudy2.control.conditional;

import java.util.Scanner;

public class FlowEx11 { //중첩 swtich문
    public static void main(String[] args) {
        System.out.print("당신의 주민번호를 입력하세요.(010305-1234567)>");

        Scanner sc = new Scanner(System.in);
        String regNo = sc.nextLine();
        char gender = regNo.charAt(7);

        switch (gender) {
            case '1': case '3':
                switch (gender) {
                    case '1':
                        System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
                        break;
                    case '3':
                        System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
                }
                break; // case '1' '3'에 대한 break문 반드시 필요
            case '2': case '4':
                switch (gender) {
                    case '2':
                        System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
                        break;
                    case '4':
                        System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
                }
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }
}
