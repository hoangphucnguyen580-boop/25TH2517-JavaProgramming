package ntu.nguyenhoangphuc;

import java.util.List;

public class Lab5_Bai3_DonHang {
	private String maDH;
    private String tenKH;
    private List<String> danhSachSanPham;
    private double tongTien;
    private String ngayDat; // định dạng "dd/MM/yyyy", vd: "15/03/2026"

    public Lab5_Bai3_DonHang(String maDH, String tenKH, List<String> danhSachSanPham, double tongTien, String ngayDat) {
        this.maDH = maDH;
        this.tenKH = tenKH;
        this.danhSachSanPham = danhSachSanPham;
        this.tongTien = tongTien;
        this.ngayDat = ngayDat;
    }

    // ===== Getter/Setter =====
    public String getMaDH() { return maDH; }
    public void setMaDH(String maDH) { this.maDH = maDH; }

    public String getTenKH() { return tenKH; }
    public void setTenKH(String tenKH) { this.tenKH = tenKH; }

    public List<String> getDanhSachSanPham() { return danhSachSanPham; }
    public void setDanhSachSanPham(List<String> danhSachSanPham) { this.danhSachSanPham = danhSachSanPham; }

    public double getTongTien() { return tongTien; }
    public void setTongTien(double tongTien) { this.tongTien = tongTien; }

    public String getNgayDat() { return ngayDat; }
    public void setNgayDat(String ngayDat) { this.ngayDat = ngayDat; }

    @Override
    public String toString() {
        return String.format("%-6s | KH: %-10s | Ngày: %-10s | Tổng tiền: %,10.0f đ | SP: %s",
                maDH, tenKH, ngayDat, tongTien, danhSachSanPham);
    }

}
