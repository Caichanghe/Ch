package Xiancheng;

public class Tdo1 extends Thread {
    public Tdo1() {

    }

    public Tdo1(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 50000000; i++) {
            if (i % 2 == 0) {
                System.out.println(getName() + ":" + i);
            }
        }
    }
}
