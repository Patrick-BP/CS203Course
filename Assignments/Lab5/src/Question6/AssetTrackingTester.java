package Question6;

import java.util.ArrayList;
import java.util.List;

public class AssetTrackingTester {
    public static void main(String[] args) {


        List<Asset> AppliancesList = new ArrayList<>();
        List<Asset> AutomobilesList = new ArrayList<>();
        List<Asset> furnituresList = new ArrayList<>();
        List<Asset> compactDisksList = new ArrayList<>();

    Asset asset1 = new Appliances("1223h76ju7698");
    Asset asset2 = new Appliances("345h76ju7698");
    Asset asset3 = new Automobiles("1223h76ju7698");
    Asset asset4 = new Automobiles("23543h76ju7698");
    Asset asset5 = new Furnitures("1223h76ju7698");
    Asset asset6 = new Furnitures("90098h76ju7698");
    Asset asset7 = new CompactDisk("675h76ju7698");
    Asset asset8 = new CompactDisk("45344h76ju7698");

        asset1.addlist(AppliancesList, asset1);
        asset2.addlist(AppliancesList, asset2);
        System.out.println(AppliancesList);

        asset1.modify(AppliancesList,asset1,asset5);
        System.out.println(AppliancesList);

        asset1.delete(AppliancesList,asset1);
        System.out.println(AppliancesList);
    }




}
