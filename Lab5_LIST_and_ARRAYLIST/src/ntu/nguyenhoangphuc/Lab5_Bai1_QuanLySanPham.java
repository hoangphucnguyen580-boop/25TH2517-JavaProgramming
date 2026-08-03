package ntu.nguyenhoangphuc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lab5_Bai1_QuanLySanPham {
	private ArrayList<Lab5_Bai1_SanPhan> danhSachSP;

    public Lab5_Bai1_QuanLySanPham() {
        this.danhSachSP = new ArrayList<>();
    }

    // 1. Thêm sản phẩm
    public void themSanPham(Lab5_Bai1_SanPhan sp) {
        danhSachSP.add(sp);
    }

    // 2. Xóa sản phẩm theo mã
    // removeIf duyệt và xóa an toàn, tránh lỗi ConcurrentModificationException
    // (lỗi xảy ra khi vừa duyệt vòng for-each vừa remove() trực tiếp trên list)
    public boolean xoaSanPhamTheoMa(String maSP) {
        return danhSachSP.removeIf(sp -> sp.getMaSP().equalsIgnoreCase(maSP));
    }

    // 3. Tìm sản phẩm theo tên (tìm gần đúng - chứa chuỗi, không phân biệt hoa/thường)
    public List<Lab5_Bai1_SanPhan> timSanPhamTheoTen(String tuKhoa) {
        List<Lab5_Bai1_SanPhan> ketQua = new ArrayList<>();
        for (Lab5_Bai1_SanPhan sp : danhSachSP) {
            if (sp.getTenSP().toLowerCase().contains(tuKhoa.toLowerCase())) {
                ketQua.add(sp);
            }
        }
        return ketQua;
    }

    // 4. Sắp xếp sản phẩm theo giá (tangDan = true: tăng dần, false: giảm dần)
    // Comparator.comparingDouble tạo bộ so sánh dựa trên giá trị double trả về từ getGia()
    public void sapXepTheoGia(boolean tangDan) {
        if (tangDan) {
            danhSachSP.sort(Comparator.comparingDouble(Lab5_Bai1_SanPhan::getGia));
        } else {
            danhSachSP.sort(Comparator.comparingDouble(Lab5_Bai1_SanPhan::getGia).reversed());
        }
    }

    // 5. Tính tổng giá trị kho hàng = tổng (giá * số lượng) của tất cả sản phẩm
    public double tinhTongGiaTriKho() {
        double tong = 0;
        for (Lab5_Bai1_SanPhan sp : danhSachSP) {
            tong += sp.getGia() * sp.getSoLuong();
        }
        return tong;
    }

    // 6. Liệt kê sản phẩm sắp hết hàng (số lượng < 10)
    public List<Lab5_Bai1_SanPhan> lietKeSapHetHang() {
        List<Lab5_Bai1_SanPhan> ketQua = new ArrayList<>();
        for (Lab5_Bai1_SanPhan sp : danhSachSP) {
            if (sp.getSoLuong() < 10) {
                ketQua.add(sp);
            }
        }
        return ketQua;
    }

    // Hiển thị toàn bộ danh sách - tiện cho việc debug/demo
    public void hienThiTatCa() {
        if (danhSachSP.isEmpty()) {
            System.out.println("Kho hàng trống.");
            return;
        }
        for (Lab5_Bai1_SanPhan sp : danhSachSP) {
            System.out.println(sp);
        }
    }

    public ArrayList<Lab5_Bai1_SanPhan> getDanhSachSP() {
        return danhSachSP;
    }

}
