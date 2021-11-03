public class PhoneNumber  {
    private int type;
    private long number;

    public PhoneNumber() {
        type = 0;
        number = 4690000000L;
    }

    public PhoneNumber(int type, long number) {
        this.type = type;
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "type=" + type +
                ", number=" + number +
                '}';
    }
}
