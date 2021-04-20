package Saip;

public class Relay implements Runnable {
    private int num = 25;
    private int total = 1000;
    private int count = 0;
    private boolean boo = false;

    @Override
    public  void run() {
        while (!boo) {
            relay();
            total -= 100;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void relay() {
        if (total > 0) {
            String thread = Thread.currentThread().getName();
            System.out.println(thread + "拿到了接力棒");
            for (int i = 1; i <= num; i++) {
                System.out.println(Thread.currentThread().getName() + "跑了" + (i * 10) + "米");
                count += 10;
            }
        }else{
            System.out.println("已经跑了1000米");
            boo = true;
        }
    }
}
