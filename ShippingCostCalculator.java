public class ShippingCostCalculator implements ShippingCostVisitor {
    
    @Override
    public double visit(Chair chair) {
        // Flat rate shipping for chairs based on weight
        return chair.getWeight() * 5;
    }

    @Override
    public double visit(Sofa sofa) {
        // Distance-based and weight-based shipping cost for sofas
        return sofa.getDistance() * 2 + sofa.getWeight() * 10;
    }

    @Override
    public double visit(Table table) {
        // Size-based shipping cost for tables
        return table.getSize() * 7;
    }
}
