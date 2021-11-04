package Question6;

public class Appliances implements Comparable<Appliances>{
    private String category;
    private int serialNumber;

    public Appliances() {
        this.serialNumber = 0;
    }

    public Appliances(String category, int serialNumber) {
        this.category = category;
        this.serialNumber = serialNumber;
    }

    public String getCategory() {
        return category;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return  serialNumber + " " + category;
    }

    @Override
    public int compareTo(Appliances o) {
        return serialNumber - o.serialNumber;
    }
}
