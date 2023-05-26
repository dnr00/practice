package main.part.com.javastudy.extend;

import java.nio.channels.Channel;

public class DmbCellPhone extends CellPhone {
    //field
    int channel;

    //const
    DmbCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    //method
    void turnOnDmb() {
        System.out.println("채널 " + channel + "번 방송 수신을 시작합니다.");
    }

    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("채널 " + channel + "번으로 바꿉니다.");
    }

    void turnOffDmb() {
        System.out.println("DMB 방송 수신 정지");
    }
}
