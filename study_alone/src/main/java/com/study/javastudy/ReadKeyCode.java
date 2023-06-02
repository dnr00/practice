package main.part.com.selfstudy.javastudy;

public class ReadKeyCode {

    //키코드 변수에 저장
    public static void main(String[] args) throws Exception {
        int keyCode;

        while(true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
            if(keyCode == 113) {
                break;
            }
        }

        System.out.println("종료");
    }
}
