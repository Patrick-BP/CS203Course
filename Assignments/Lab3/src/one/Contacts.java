package one;


import java.util.ArrayList;
import java.util.List;

public class Contacts {
    private String name;
    private List<Address> address = new ArrayList<>() ;
    private List<String> phone  = new ArrayList<>();
    private List<String> email  = new ArrayList<>();
    private String note ;

    public Contacts(){}

    public Contacts(String name) {
        this.name = name;
    }

    public Contacts(String name, List<String> phone, List<String>  email, List<Address> address, String note) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.note = note;
    }
    public Contacts(String name,List<String> phone, List<String>  email, List<Address> address) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;

    }
    public String getName() {
        return name;
    }

    public List<Address> getAddress() {
        return address;
    }

    public List<String> getPhone() {
        return phone;
    }

    public List<String> getEmail() {
        return email;
    }

    public String getNote() {
        return note;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public void setNote(String note) {
        this.note = note;
    }



    @Override
    public String toString(){
        return " " + name + phone + email + address + note;
    }
}
