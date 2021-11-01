package two;

public class PhoneNumber extends Contact {
    private int type;
    private int number;
    public PhoneNumber() {
        this.type = 1;
        this.number = 469543678;
    }

    public PhoneNumber(int type, int number) {
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
