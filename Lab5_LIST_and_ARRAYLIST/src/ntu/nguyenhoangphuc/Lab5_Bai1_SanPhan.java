package ntu.nguyenhoangphuc;

public class Lab5_Bai1_SanPhan {
	//Khai báo
	private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;

    public Lab5_Bai1_SanPhan(String maSP, String tenSP, double gia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    // ===== Getter/Setter =====
    public String getMaSP() { return maSP; }
    public void setMaSP(String maSP) { this.maSP = maSP; }

    public String getTenSP() { return tenSP; }
    public void setTenSP(String tenSP) { this.tenSP = tenSP; }

    public double getGia() { return gia; }
    public void setGia(double gia) { this.gia = gia; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    @Override
    public String toString() {
        // Định dạng hiển thị gọn cho console: mã | tên | giá | số lượng
        return String.format("%-6s | %-20s | %,10.0f đ | SL: %d", maSP, tenSP, gia, soLuong);
    }

}
