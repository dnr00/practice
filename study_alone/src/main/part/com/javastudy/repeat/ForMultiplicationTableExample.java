package main.part.com.javastudy.repeat;

//구구단
public class ForMultiplicationTableExample {
    public static void main(String[] args) {
        for (int m=2; m<=9; m++) { //for문은 정해진 횟수만큼 반복
            System.out.println("*** " + m + "단 ***");
            for (int n=1; n<=9; n++) {
                System.out.println(m + " x " + n + " = " + (m * n));
            }
        }
    }
}
