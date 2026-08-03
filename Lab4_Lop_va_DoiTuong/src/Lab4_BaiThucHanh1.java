
public class Lab4_BaiThucHanh1 {
	//Khai báo thuộc tính
    private String hangXe;
    private String mauSac;
    private int tocDoHienTai;
    
 // Getter/setter cho hangXe
    public String getHangXe() {
        return hangXe;
    }
    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    // Getter/setter cho mauSac
    public String getMauSac() {
        return mauSac;
    }
    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    
    public int getTocDoHienTai() {
        return tocDoHienTai;
    }
    
 // Phương thức
    void tangToc(int km) {
        tocDoHienTai += km;
        System.out.println(hangXe + " tăng tốc lên " + tocDoHienTai + " km/h");
    }
    
    void phanh() {
        tocDoHienTai = 0;
        System.out.println(hangXe + " đã dừng lại");
    }
    
    void hienThiThongTin() {
        System.out.println("Hãng xe: " + hangXe);
        System.out.println("Màu sắc: " + mauSac);
        System.out.println("Tốc độ hiện tại: " + tocDoHienTai + " km/h");
    }
}
