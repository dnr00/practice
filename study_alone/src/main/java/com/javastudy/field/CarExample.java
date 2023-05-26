package main.java.com.javastudy.field;

public class CarExample {
    public static void main(String[] args) {
        //객체 생성
        Car car1 = new Car();
        System.out.println("car1.company : " + car1.company);
        System.out.println();

        Car car2 = new Car("자가용");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();

        Car car3 = new Car("자가용", "빨강");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        Car car4 = new Car("택시", "검정", 200);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
        System.out.println();

        Car myCar = new Car();

        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas();
        if(gasState) {
            System.out.println("출발~");
            myCar.run();
        }

        if(myCar.isLeftGas()) {
            System.out.println("gas를 주입할 필요가 없음");
        } else {
            System.out.println("gas를 주입하세요.");
        }

        myCar.keyTurnOn();
        myCar.run1();
        int speed = myCar.getSpeed();
        System.out.println("현재 속도: " + speed + "km/h)");
    }
}
