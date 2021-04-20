package Yinhang;

public class TakeCash {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Person1 pA = new Person1(bank);
        Person2 pB = new Person2(bank);
        // 两个人开始取钱
        pA.start();
        pB.start();
    }
}
