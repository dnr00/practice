package main.java.com.study.javastudy.protect2;

import main.java.com.study.javastudy.protect.ProtectedExampleA;

public class ProtectedExampleD extends ProtectedExampleA {
    public ProtectedExampleD() {
        super();
        this.field = "value";
        this.method(); //상속한 경우에는 protected 클래스여도 접근 가능
    }
}
