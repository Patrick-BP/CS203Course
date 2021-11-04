package Question6;

public class Automobiles implements Comparable<Automobiles>{
    private String category;
    private int serialNumber;

    public Automobiles() {
        this.serialNumber = 0;
    }

    public Automobiles(String category, int serialNumber) {
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
        return
                serialNumber + " " +category;
    }

    @Override
    public int compareTo(Automobiles o) {
        return serialNumber - o.serialNumber;
    }
}
