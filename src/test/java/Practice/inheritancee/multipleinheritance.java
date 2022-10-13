package Practice.inheritancee;

public class multipleinheritance implements A,B{

    public static void main(String[] args) {
    A a=new multipleinheritance();
    a.call();
    }

    @Override
    public void call() {
        System.out.println("call method calling");
    }
}
