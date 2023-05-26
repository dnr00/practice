package main.part.com.javastudy.extend;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        //DmbCellPhone 객체 생성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

        //CellPhone 상속 필드
        System.out.println("모델: " + dmbCellPhone.model);
        System.out.println("색상: " + dmbCellPhone.color);

        //DmbCellPhone 필드
        System.out.println("채널: " + dmbCellPhone.channel);

        //CellPhone 상속 메소드 호출
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("안녕하세요");
        dmbCellPhone.receivedVoice("안녕하세요! 저는 홍길동입니다.");
        dmbCellPhone.sendVoice("네, 반갑습니다.");
        dmbCellPhone.hangUp();

        //DmbCellPhone 메소드 호출
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();

    }


}
