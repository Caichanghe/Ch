package Yinh;

public class Person1 implements Runnable{
    Bank bank=new Bank();
    public Person1(){
    }
    public Person1(Bank bank){
        this.bank=bank;
    }


    @Override
    public void run() {
        while (true){
            synchronized (bank){
                if (bank.money>=100){
                    bank.getMoney1(100);
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
}
