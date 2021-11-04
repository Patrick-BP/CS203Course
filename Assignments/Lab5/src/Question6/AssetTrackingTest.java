package Question6;

import java.util.Collections;

public class AssetTrackingTest {
    public static void main(String[] args) {
        Asset ass1= new Asset();
        Appliances ap1 = new Appliances("Appliance",12123);
        Appliances ap2 = new Appliances("Appliance",12434);
        Automobiles auto1 = new Automobiles("Automobile",23232);
        Automobiles auto2 = new Automobiles("Automobile",23455);
        CompactDisk compdick1 = new CompactDisk("CompactDisk",23445);
        CompactDisk compdick2 = new CompactDisk("CompactDisk",34566);
        Furnitures furniture1 = new Furnitures("Furniture",34534);
        Furnitures furniture2 = new Furnitures("Furniture",34563);
        ass1.AddAppliances(ap1);
        ass1.AddAppliances(ap2);
        ass1.AddAutomobiles(auto1);
        ass1.AddAutomobiles(auto2);
        ass1.AddCompactDisk(compdick1);
        ass1.AddCompactDisk(compdick2);
        ass1.AddFurniture(furniture1);
        ass1.AddFurniture(furniture2);

        Collections.sort(ass1.getAppList());
        Collections.sort(ass1.getAutList());
        Collections.sort(ass1.getCompactList());
        Collections.sort(ass1.getFurnitureList());
        System.out.println(ass1);



    }


}
