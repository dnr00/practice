package main.java.com.study.javastudy.practice;

public class ForSum3Example1 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1; i<=100; i++) {
            if(i%3 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
