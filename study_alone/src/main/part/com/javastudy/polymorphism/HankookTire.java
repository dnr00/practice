package main.part.com.javastudy.polymorphism;

public class HankookTire extends Tire{
    //field
    //const
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    //method
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation) {
            System.out.println(location + " HankookTire 수명: " +
                    (maxRotation-accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + "HankookTire 펑크 ***");
            return false;
        }
    }
}
