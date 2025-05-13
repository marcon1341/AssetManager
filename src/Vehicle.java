import java.time.LocalDate;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost,
                   String makeModel, int year, int odometer){
        super(description, dateAcquired, originalCost);
        this.makeModel=makeModel;
        this.year=year;
        this.odometer=odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public int getYear() {
        return year;
    }
    @Override
    public double getValue(){
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;
        double value;
        if(age <= 3){
            value = getOriginalCost() * Math.pow(0.97,age);
        }else if(age <= 6){
            value = getOriginalCost() * Math.pow(0.94, age);
        }else if(age <= 8){
            value = getOriginalCost() * Math.pow(0.92, age);
        }else {
            value = 1000.00;
        }
        if(odometer > 100000 && !(makeModel.toLowerCase().contains("honda") ||
                makeModel.toLowerCase().contains("toyota"))){
            value *= 0.75;
        }
    return value;
    }
}
