package ntu.nguyenhoangphuc;

public class Lab5_BaiThucHanh2 {
	private String maSV;
    private String hoTen;
    private double diemTB;

    public Lab5_BaiThucHanh2(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    // Getter
    public String getMaSV() { return maSV; }
    public String getHoTen() { return hoTen; }
    public double getDiemTB() { return diemTB; }

    @Override
    public String toString() {
        return String.format("Mã: %-8s | Tên: %-20s | Điểm: %.1f", maSV, hoTen, diemTB);
    }
}
