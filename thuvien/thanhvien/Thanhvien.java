package thuvien.thanhvien;

import thuvien.book.Book;

public class Thanhvien  {
    private String code;
    private String name;
    private String address;
    private String phone;

    public Thanhvien(String code, String name, String address, String phone) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(){
        return getCode() + "-"+ getName() + "-"+ getAddress() + "-" + getPhone();
    }
}
