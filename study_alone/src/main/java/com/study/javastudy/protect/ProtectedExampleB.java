package main.part.com.selfstudy.javastudy.protect;

public class ProtectedExampleB {
    public void method() {
        ProtectedExampleA a = new ProtectedExampleA();
        a.field = "value";
        a.method();
    }
}
