package Saipao;

public class Relay implements Runnable {
    private int num = 25;   //每个人跑的时候显示的数量
    private int total = 1000;
    private int count = 0;   //记数
    private boolean boo = false;

    @Override
    public  void run() {

        //运行接力赛这个经过线程同步的方法
        while (!boo) {

            //运行接力的方法
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
        //如果没跑完就继续跑
        if (total > 0) {
            String thread = Thread.currentThread().getName();
            //按提示输出
            System.out.println(thread + "拿到了接力棒");
            //设定单个选手的跑的变量

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
