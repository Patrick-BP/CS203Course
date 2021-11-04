package Question6;

public class CompactDisk implements Comparable<CompactDisk> {
    private String category;
    private int serialNumber;

    public CompactDisk() {
        this.serialNumber = 0;
    }

    public CompactDisk(String category, int serialNumber) {
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
                serialNumber + " "+category;
    }

    @Override
    public int compareTo(CompactDisk o) {
        return serialNumber - o.serialNumber;
    }

}
