package Yinh;

public class Person2 implements Runnable{
    Bank bank=new Bank();
    public Person2(){
    }
    public Person2(Bank bank){
        this.bank=bank;
    }

    @Override
    public void run() {
        while (true){
            if (bank.money>=200){
                bank.getMoney2(200);
            }else{
                break;
            }

        }
        bank.notify();
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
