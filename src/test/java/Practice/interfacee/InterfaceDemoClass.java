package Practice.interfacee;

import Practice.inheritancee.InterfaceDemo;

public class InterfaceDemoClass implements InterfaceDemo {
    @Override
    public void call() {
        System.out.println("Interface call Method calling");
    }

    @Override
    public void show() {
        System.out.println("Interface Show Method calling");
        throw new RuntimeException();
    }
}
