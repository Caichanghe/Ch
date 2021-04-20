package Niao;

public class Bgniao extends Niao implements Changge{
    @Override
    public void changge() {
        System.out.println("唱歌");
    }

    @Override
    void fly() {
        System.out.println("飞的跟太阳肩并肩");
    }

    @Override
    void sing() {
        System.out.println("叫。。。");
    }
}
