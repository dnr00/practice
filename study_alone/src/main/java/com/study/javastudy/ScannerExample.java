package main.java.com.study.javastudy;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); //시스템의 입력 장치로부터 읽어오는 scanner 생성
        String inputData;

        while(true) {
            inputData = scanner.nextLine(); // Enter 입력 전까지의 문자열을 읽음
            System.out.println("입력된 문자열: \"" + inputData + "\"");
            if(inputData.equals("q")) {
                break;
            }
        }

        System.out.println("종료");
    }
}
