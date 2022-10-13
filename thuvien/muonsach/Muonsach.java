package thuvien.muonsach;

public class Muonsach {
    private String maSach;
    private String maThanhVien;
    private String ngayMuon;
    private String ngayTra;

    public Muonsach(String maSach, String maThanhVien, String ngayMuon, String ngayTra) {
        this.maSach = maSach;
        this.maThanhVien = maThanhVien;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getMaThanhVien() {
        return maThanhVien;
    }

    public void setMaThanhVien(String maThanhVien) {
        this.maThanhVien = maThanhVien;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String toString(){
        return getMaSach() + "-" + getMaThanhVien() + "- "+ getNgayMuon() + "-"+getNgayTra();
    }
}
