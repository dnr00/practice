package main.part.com.selfstudy.javastudy.practice;

public class ForStar {
    public static void main(String[] args) {
        for(int i = 1; i<5; i++) {
            for(int j= 1; j <= i; j++) {
                System.out.print("*");
                if(j == i) {
                    System.out.print(Constants.NEW_LINE);
                }
            }
        }
    }
}
