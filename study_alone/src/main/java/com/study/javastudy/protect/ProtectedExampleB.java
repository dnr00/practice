package main.java.com.study.javastudy.protect;

public class ProtectedExampleB {
    public void method() {
        ProtectedExampleA a = new ProtectedExampleA();
        a.field = "value";
        a.method();
    }
}
