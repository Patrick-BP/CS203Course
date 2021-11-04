package Question6;

public class Furnitures implements Comparable<Furnitures>{
    private String category;
    private int serialNumber;

    public Furnitures() {
        this.serialNumber = 0;
    }

    public Furnitures(String category, int serialNumber) {
        this.category = category;
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return serialNumber + " "+category;
    }

    @Override
    public int compareTo(Furnitures o) {
        return serialNumber - o.serialNumber;
    }
}
