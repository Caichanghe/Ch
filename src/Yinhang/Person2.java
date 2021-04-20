package Yinhang;

public class Person2 extends Thread {
    // 创建银行对象
    Bank bank;

    // 通过构造器传入银行对象，确保两个人进入的是一个银行
    public Person2(Bank bank) {
        this.bank = bank;
    }

    // 重写run方法，在里面使用使用ATM取钱

    @Override
    public void run() {
        while (Bank.money >= 200) {
            bank.getATM(200);// 每次取钱200块
            try {
                sleep(100);// 取完休息0.1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
