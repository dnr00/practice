package main.java.com.study.javastudy.polymorphism;

public class KumhoTire extends Tire{
    //field
    //const
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }
    //method
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation) {
            System.out.println(location + " KumhoTire 수명: " +
                    (maxRotation-accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + "KumhoTire 펑크 ***");
            return false;
        }
    }
}
