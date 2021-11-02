package Question6;

import java.util.ArrayList;
import java.util.List;

public class AssetTrackingTester {
    public static void main(String[] args) {


        List<Asset> AppliancesList = new ArrayList<>();
        List<Asset> AutomobilesList = new ArrayList<>();
        List<Asset> furnituresList = new ArrayList<>();
        List<Asset> compactDisksList = new ArrayList<>();

    Asset asset1 = new Appliances("11111");
    Asset asset2 = new Appliances("22222");
    Asset asset3 = new Automobiles("33333");
    Asset asset4 = new Automobiles("44444");
    Asset asset5 = new Furnitures("555555");
    Asset asset6 = new Furnitures("666666");
    Asset asset7 = new CompactDisk("77777");
    Asset asset8 = new CompactDisk("888888");

        asset1.addlist(AppliancesList, asset1);
        asset2.addlist(AppliancesList, asset2);
        System.out.println(AppliancesList);

        asset1.modify(AppliancesList,asset1,asset5);
        System.out.println(AppliancesList);

        asset1.delete(AppliancesList,asset5);
        System.out.println(AppliancesList);
    }




}
