public class ShipCostCalculator {
    public static void main(String[] args) {


        double price;
        double shipCost = 0;
        final   double SHIPPING_RATE = 0.2;
        double totalPrice;

        price = 80;
        if (price < 100){
            shipCost = price * SHIPPING_RATE;
        }
        totalPrice = price + shipCost;
        System.out.println("The total price is "+ totalPrice);


    }
}
