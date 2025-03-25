public interface ShippingCostVisitor {
    double visit(Chair chair);
    double visit(Sofa sofa);
    double visit(Table table);
}
