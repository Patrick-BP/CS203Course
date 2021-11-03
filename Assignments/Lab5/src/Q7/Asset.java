package Q7;

import java.util.ArrayList;
import java.util.List;

public class Asset {



    private List<Appliances> appliancesList;
    private List<Automobiles> automobilesList;
    private List<Furnitures> furnituresList;
    private List<CompactDisk> compactDiskList;

    public Asset() {
        name = "Unknown";
        serialNumber = "00000";
        this.appliancesList = new ArrayList<>();
        this.automobilesList = new ArrayList<>();
        this.furnituresList = new ArrayList<>();
        this.compactDiskList = new ArrayList<>();
    }

    public void addlist(List<Asset> a , Asset b){
        a.add(b);
    }
    public void modify(List<Asset> a ,Asset  b , Asset c){
        a.set(a.indexOf(b), c );
    }
    public void delete( List<Asset> a ,Asset  b ){
        if (!(b==null)) a.remove(b);
        else System.out.println("it does exit");

    }


}
