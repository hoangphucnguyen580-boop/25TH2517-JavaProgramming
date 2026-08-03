package ntu.nguyenhoangphuc;

public class BTTH_Bai5 {
	//Khai báo thuộc tính
	private String maHV;
    private String hoTenDayDu;
    private int namSinh;
    private String gioiTinh;

    public BTTH_Bai5() {
    } // constructor không tham số

    public BTTH_Bai5(String maHV, String hoTenDayDu, int namSinh, String gioiTinh) {
        this.maHV = maHV;
        this.hoTenDayDu = hoTenDayDu;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    } // constructor có tham số
    // ----- Getter -----
    public String getMaHV() { return maHV; }
    public String getHoTenDayDu() { return hoTenDayDu; }
    public int getNamSinh() { return namSinh; }
    public String getGioiTinh() { return gioiTinh; }

    // ----- Setter -----
    public void setMaHV(String maHV) { this.maHV = maHV; }
    public void setHoTenDayDu(String hoTenDayDu) { this.hoTenDayDu = hoTenDayDu; }
    public void setNamSinh(int namSinh) { this.namSinh = namSinh; }
    public void setGioiTinh(String gioiTinh) { this.gioiTinh = gioiTinh; }

    // Ham in thong tin - tach rieng vi bai 5 va bai 6 deu can dung lai
    public void hienThi() {
        System.out.println("Ma HV: " + maHV + " | Ho ten: " + hoTenDayDu
                + " | Nam sinh: " + namSinh + " | Gioi tinh: " + gioiTinh);
    }

}
