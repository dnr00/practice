package main.part.com.javastudy.method.callparent;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff(); //이륙
        sa.fly(); //일반비행
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly(); //초음속비행
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly(); //일반비행
        sa.land(); //착륙
    }
}
