package Yinh;

public class Test {
    public static void main(String[] args) {
        Bank a=new Bank();
        Person1 p1=new Person1(a);
        Person2 p2=new Person2(a);
        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);

        t1.start();
        t2.start();
    }
}
