package Goods;

public class Sale {
    public Goods judgePrice(Goods goods) {
        if (goods instanceof Tvs) {
            System.out.println("此类商品为电视类");
            System.out.println("商品原价格为：" + goods.price);
            System.out.println("此类商品价格为：" + goods.getPrice() * 0.9);
        } else if (goods instanceof Foods) {
            System.out.println("此类商品为食物类");
            System.out.println("商品原价格为：" + goods.price);
            System.out.println("此类商品价格为：" + goods.getPrice() * 0.8);
        }
        return goods;
    }
}
