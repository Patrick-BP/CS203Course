package two;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
    private String name;
    private Address address ;
    private String phone ;
    private String email ;
    private String note ;

    public Contacts(){}
    public Contacts(String name, Address address, String phone, String email, String note) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.note = note;
    }


    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getNote() {
        return note;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
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
