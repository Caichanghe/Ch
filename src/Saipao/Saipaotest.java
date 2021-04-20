package  Saipao;


          public class Saipaotest {
     public static void main(String[] args) {
                 //实例化 线程类
                 Relay relay = new Relay();
                 //设定10个选手
                 Thread t1 = new Thread(relay,"长鹤选手");
                 Thread t2 = new Thread(relay,"李通选手");
                Thread t3 = new Thread(relay,"啵啵选手");
                 Thread t4 = new Thread(relay,"海军选手");

                 //启动线程
                 t1.start();
                 t2.start();
                 t3.start();
                 t4.start();

             }
 }