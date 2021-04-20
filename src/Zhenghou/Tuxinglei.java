package Zhenghou;

public abstract class Tuxinglei {
    double chang;
    double kuan;
    double r;
    double mj;
    final Double Pi=3.14;
    public final double mj(Tuxinglei tuxinglei) {
        if (tuxinglei instanceof Changfangxing) {
            tuxinglei.mj = tuxinglei.chang * tuxinglei.kuan;
            System.out.println("长方形的面积为：" + tuxinglei.mj);
        } else if (tuxinglei instanceof Yuanxing) {
            tuxinglei.mj = tuxinglei.Pi * tuxinglei.r* tuxinglei.r;
            System.out.println("圆形的面积为："+tuxinglei.mj);

        }
        return tuxinglei.mj;
    }

}
