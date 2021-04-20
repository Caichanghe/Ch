package Yinhang;

public class Person1 extends Thread {
    // 创建银行对象
    Bank bank;

    // 通过构造器传入银行对象，确保两个人进入的是一个银行
    public Person1(Bank bank) {
        this.bank = bank;
    }

    // 重写run方法，在里面使用柜台取钱

    @Override
    public void run() {
        while (Bank.money >= 100) {
            bank.getCounter(100);// 每次取走100块
            try {
                sleep(100);// 取完休息0.1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}