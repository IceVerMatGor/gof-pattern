package proxy;

public class Proxy implements MyClass {
    private static MyClass myClass;

    @Override
    public void myMethod() {
        if (myClass == null) { // lazy init
            myClass = new MyClassImpl();
        }

        // do something before

        myClass.myMethod();

        // do something after
    }
}
