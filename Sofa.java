public class Sofa implements Furniture {
    private double distance;
    private double weight;

    public Sofa(double distance, double weight) {
        this.distance = distance;
        this.weight = weight;
    }

    public double getDistance() {
        return distance;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double accept(ShippingCostVisitor visitor) {
        return visitor.visit(this);
    }
}
