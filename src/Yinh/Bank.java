package Yinh;

public class Bank {
    double money =1000;

    public void getMoney1(int money){
        this.money=this.money-money;
        System.out.println("1取走100还剩"+this.money);
    }
    public void getMoney2(int money){
        this.money=this.money-money;
        System.out.println("2取走100还剩"+this.money);
    }

}
