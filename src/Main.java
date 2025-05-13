import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> myAsset = new ArrayList<>();
        //adding house
        myAsset.add(new House("My House", "2025-04-04", 600000,
                "400 Dexter ave",2, 3000,5000));
        myAsset.add(new House("Vacation House", "2020-10-10", 1000000, "121 Lake view",1,2000,1500));

        //adding vehicle
        myAsset.add(new Vehicle("My Car","2024-02-10", 45000,
                "Ford F-150", 2024, 10000));
        myAsset.add(new Vehicle("Mom Car", "2018-09-05", 20000,
                "Toyota Camry", 2018, 95000));

        //loop through for formating
        for(Asset asset : myAsset){
            String lable;
            if(asset instanceof House){
                House h = (House) asset;
                lable = "House at " + h.getAddress();
            }
            else if(asset instanceof Vehicle){
                Vehicle v = (Vehicle) asset;
                lable = "Vehicle: " + v.getYear() + " " + v.getMakeModel();
            }else{
                lable = asset.getDescription();
            }
            System.out.printf("""
                    %s
                    Date Acquired: %s
                    Original cost: $%.2f
                    Current Value: $%.2f\n
                    """,lable,asset.getDateAcquired(),
                    asset.getOriginalCost(),
                    asset.getValue());
        }
    }
}