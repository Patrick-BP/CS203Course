public class EmailAddress {
    private int type;
    private String emailAddress;
    public EmailAddress() {
        this.type = 0;
        this.emailAddress = "pat@miu.edu";
    }
    public EmailAddress(int type, String emailAddress) {
        this.type = type;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "type=" + type +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
