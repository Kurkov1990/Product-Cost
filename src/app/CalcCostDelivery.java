package app;

public class CalcCostDelivery extends  CalcCostBase {
    private static final double DELIVERY_PRICE = 7.5;

    @Override
    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice()
                + DELIVERY_PRICE;
    }
}
