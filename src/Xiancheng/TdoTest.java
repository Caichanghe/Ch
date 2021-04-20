package Xiancheng;

public class TdoTest {
    public static void main(String[] args) {
        Tdo t1=new Tdo();
        Thread thread=new Thread(t1,"线程壹");
        thread.start();
        Tdo1 t2=new Tdo1("线程贰");
        t2.start();
    }
}
