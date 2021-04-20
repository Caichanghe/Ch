package Xiancheng;

public class Tdo implements Runnable{
    public void run(){
        for (int i = 51; i <=10000000 ; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }

}
