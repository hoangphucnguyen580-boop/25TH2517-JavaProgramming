
public class Lab4_Bai3 {
	//Khai báo thuộc tính
	private String soTaiKhoan;
    private String tenChuTaiKhoan;
    private double soDu;

    public Lab4_Bai3(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
    }

 // Getter/setter cho Số tài khoản
    public String getSoTaiKhoan() { return soTaiKhoan; }
    public void setSoTaiKhoan(String soTaiKhoan) { this.soTaiKhoan = soTaiKhoan; }

 // Getter/setter cho Tên chủ tài khoản
    public String getTenChuTaiKhoan() { return tenChuTaiKhoan; }
    public void setTenChuTaiKhoan(String tenChuTaiKhoan) { this.tenChuTaiKhoan = tenChuTaiKhoan; }

 // Getter cho Số dư
    public double getSoDu() { return soDu; }

    // Thêm tiền vào tài khoản
    public void guiTien(double soTien) {
        if (soTien <= 0) {
            System.out.println("Số tiền gửi phải lớn hơn 0!");
            return;
        }
        soDu += soTien;
        System.out.println("Đã gửi " + soTien + " VNĐ vào tài khoản " + soTaiKhoan);
    }

    // Rút tiền nếu đủ số dư
    public void rutTien(double soTien) {
        if (soTien <= 0) {
            System.out.println("Số tiền rút phải lớn hơn 0!");
            return;
        }
        if (soTien > soDu) {
            System.out.println("Số dư không đủ để rút " + soTien + " VNĐ!");
            return;
        }
        soDu -= soTien;
        System.out.println("Đã rút " + soTien + " VNĐ từ tài khoản " + soTaiKhoan);
    }

    // Chuyển tiền sang tài khoản khác
    public void chuyenTien(Lab4_Bai3 taiKhoanKhac, double soTien) {
        if (soTien <= 0) {
            System.out.println("Số tiền chuyển phải lớn hơn 0!");
            return;
        }
        if (soTien > soDu) {
            System.out.println("Số dư không đủ để chuyển " + soTien + " VNĐ!");
            return;
        }
        // Trừ tiền tài khoản hiện tại
        this.soDu -= soTien;
        taiKhoanKhac.soDu += soTien;
        System.out.println("Đã chuyển " + soTien + " VNĐ từ " + this.soTaiKhoan
                + " sang " + taiKhoanKhac.soTaiKhoan);
    }

    // Hiển thị số dư hiện tại
    public void hienThiSoDu() {
        System.out.println("Tài khoản " + soTaiKhoan + " (" + tenChuTaiKhoan + ") - Số dư: " + soDu + " VNĐ");
    }

}
