
public class Lab4_BaiThucHanh2 {
	// Thuộc tính
    private double chieuDai;
    private double chieuRong;

    public Lab4_BaiThucHanh2(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // Getter/setter cho chieuDai
    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double chieuDai) {
        if (chieuDai > 0) {
            this.chieuDai = chieuDai;
        } else {
            System.out.println("Chiều dài phải lớn hơn 0!");
        }
    }

    // Getter/setter cho chieuRong
    public double getChieuRong() {
        return chieuRong;
    }
    public void setChieuRong(double chieuRong) {
        if (chieuRong > 0) {
            this.chieuRong = chieuRong;
        } else {
            System.out.println("Chiều rộng phải lớn hơn 0!");
        }
    }

    // Phương thức tính diện tích
    double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    // Phương thức tính chu vi
    double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    // Phương thức kiểm tra có phải hình vuông không
    boolean laHinhVuong() {
        return chieuDai == chieuRong;
    }

    // Phương thức hiển thị thông tin
    void hienThiThongTin() {
        System.out.println("Chiều dài: " + chieuDai);
        System.out.println("Chiều rộng: " + chieuRong);
        System.out.println("Diện tích: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Là hình vuông? " + (laHinhVuong() ? "Có" : "Không"));
    }
}
