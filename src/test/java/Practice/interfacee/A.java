package Practice.interfacee;


public class A {

    public void classA1(){

        System.out.println("classA1");
    }
    public void classA2(){

        System.out.println("classA2");
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.classA1();
        a.classA2();
        b.classA1();
        b.classB2();
        c.classA1();
    }
}
