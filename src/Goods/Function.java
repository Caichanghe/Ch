package Goods;

public class Function {
    public static void main(String[] args) {
        Sale sale = new Sale();
        Goods outTvs = new Tvs();
        Goods outFoods = new Foods();
        outTvs.setPrice(1000.0);
        outFoods.setPrice(100.0);
        sale.judgePrice(outTvs);
        sale.judgePrice(outFoods);
    }
}
