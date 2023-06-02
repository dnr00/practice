package main.part.com.selfstudy.javastudy.polymorphism.casting;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child(); //자동 타입 변환
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        /*
        parent.field2() = "data2";
        parent.method3();       //method3은 자식 클래스에서 선언한 메소드
        */

        Child child = (Child) parent; //강제 타입 변환
        child.field2 = "yyy";
        child.method3();
    }
}
