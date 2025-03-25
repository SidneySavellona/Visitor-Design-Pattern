public class Client {
    public static void main(String[] args) {
        ShippingCostCalculator calculator = new ShippingCostCalculator();

        Chair chair = new Chair(10); // Weight is 10kg
        Sofa sofa = new Sofa(50, 30); // Distance is 50km, weight is 30kg
        Table table = new Table(20); // Size is 20 square meters

        System.out.println("Shipping cost for Chair: $" + chair.accept(calculator));
        System.out.println("Shipping cost for Sofa: $" + sofa.accept(calculator));
        System.out.println("Shipping cost for Table: $" + table.accept(calculator));
    }
}
