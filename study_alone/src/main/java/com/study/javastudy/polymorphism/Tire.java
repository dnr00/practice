package main.java.com.study.javastudy.polymorphism;

public class Tire {
    //polymorphism(다형성)

    //field
    public int maxRotation;         //최대 회전수(타이어의 수명)
    public int accumulatedRotation; //누적 회전수
    public String location;         //타이어의 위치

    //const
    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    //method
    public boolean roll() {
        ++accumulatedRotation;             //누적 회전수 1 증가
        if(accumulatedRotation<maxRotation) {
            System.out.println(location + "Tire 수명: " +
                    (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " Tire 펑크 ***");
            return false;
        }
    }
}
