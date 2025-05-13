public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description,String dateAcquired,double originalCost,String address, int condition, int squareFoot, int lotSize){
        super(description, dateAcquired, originalCost);
        this.address=address;
        this.condition=condition;
        this.squareFoot=squareFoot;
        this.lotSize=lotSize;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public double getValue() {
        double valuePerFoot;
        switch (condition){
            case 1 -> valuePerFoot = 180.00;
            case 2 -> valuePerFoot = 130.00;
            case 3 -> valuePerFoot = 90.00;
            default -> valuePerFoot = 80.00;
        }
        return (valuePerFoot * squareFoot) + (0.25 * lotSize);
    }
}
