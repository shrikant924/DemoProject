package Practice.abstractt;

import Practice.inheritancee.InterfaceDemo;
import Practice.interfacee.InterfaceDemoClass;

public abstract class AbstractClass {

    void call(){
        System.out.println("Hello");
    };

    public abstract void notImplemented();
    public static void main(String[] args) {
        xyz xyz=new xyz();
        xyz.call();
        xyz.notImplemented();

        InterfaceDemo InterfaceDemo=new InterfaceDemoClass();
        InterfaceDemo.call();
        InterfaceDemo.show();
    }
}
