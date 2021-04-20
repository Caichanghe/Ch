package Yinhang;

public class Bank {
    // 假设一个账户有1000块钱
    static int money = 1000
            ;

    // 柜台取钱的方法
    public synchronized void getCounter(int money1) {
        Bank.money -= money1;// 取钱后总数减少
        System.out.println("柜台取钱" + money1 + "还剩下" + Bank.money);
    }

    // ATM取钱的方法
    public synchronized void getATM(int money2) {// 参数是每次取走的钱
        Bank.money -= money2;// 取钱后总数减少
        System.out.println("ATM取钱" + money2 + "还剩下" + Bank.money);
    }

}
