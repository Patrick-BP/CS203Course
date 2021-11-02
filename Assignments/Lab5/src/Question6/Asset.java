package Question6;

import java.util.List;

public class Asset {
    private String serialNumber;


    public Asset(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void addlist(List<Asset> a , Asset b){
        a.add(b);
    }
    public void modify(List<Asset> a ,Asset  b , Asset c){
        a.set(a.indexOf(b), c );
    }
    public void delete( List<Asset> a ,Asset  b ){
        if (b) a.remove(b);
        else System.out.println("it does exit");

    }

    @Override
    public String toString() {
        return "Asset{" +
                "serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
