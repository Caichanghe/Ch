package Niao;

public class Test {
    public static void main(String[] args) {
        Changge changge = new Changge() {
            @Override
            public void changge() {
                System.out.println("布谷鸟唱歌");
            }
        };
        changge.changge();

        Bgniao bgniao = new Bgniao() {
            public void changge() {
                System.out.println("布谷鸟唱小苹果");
            }
        };
        bgniao.changge();
        bgniao.fly();
        bgniao.sing();
    }

}
