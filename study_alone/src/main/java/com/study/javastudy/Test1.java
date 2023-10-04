package main.java.com.study.javastudy;

import java.util.Scanner;

public class Test1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (b % 10);
        int d = (b % 100) - c;
        int e = b - c - d;

        if( a>= 100 && a<= 999 &&
                b>= 100 && b<= 999) {
            System.out.println( a * c );
            System.out.println( a * d / 10 );
            System.out.println( a * e / 100 );
            System.out.println( a * c + a * d + a * e);
        }
    }
}