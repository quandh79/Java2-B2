package thuvien.book;

public class Book {
    private String maSach;
    private String tenSach;
    private String theLoai;
    private int soLuong;

    public Book(String maSach, String tenSach, String theLoai, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.theLoai = theLoai;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String toString(){
        return getMaSach() + "- " + getTenSach() + "-"+ getTheLoai() + "-" + getSoLuong();
    }
}
