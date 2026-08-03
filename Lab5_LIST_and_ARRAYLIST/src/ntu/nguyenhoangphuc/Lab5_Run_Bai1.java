package ntu.nguyenhoangphuc;

import java.util.List;

public class Lab5_Run_Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab5_Bai1_QuanLySanPham qlsp = new Lab5_Bai1_QuanLySanPham();

        // Thêm dữ liệu mẫu
        qlsp.themSanPham(new Lab5_Bai1_SanPhan("SP01", "Bàn phím cơ", 850000, 15));
        qlsp.themSanPham(new Lab5_Bai1_SanPhan("SP02", "Chuột không dây", 250000, 8));
        qlsp.themSanPham(new Lab5_Bai1_SanPhan("SP03", "Màn hình 24 inch", 3200000, 5));
        qlsp.themSanPham(new Lab5_Bai1_SanPhan("SP04", "Bàn di chuột", 90000, 40));
        qlsp.themSanPham(new Lab5_Bai1_SanPhan("SP05", "Tai nghe Bluetooth", 650000, 3));

        System.out.println("===== DANH SÁCH SẢN PHẨM BAN ĐẦU =====");
        qlsp.hienThiTatCa();

        // Xóa sản phẩm theo mã
        System.out.println("\n===== XÓA SP04 =====");
        boolean daXoa = qlsp.xoaSanPhamTheoMa("SP04");
        System.out.println("Xóa thành công: " + daXoa);
        qlsp.hienThiTatCa();

        // Tìm sản phẩm theo tên (gần đúng)
        System.out.println("\n===== TÌM SẢN PHẨM CÓ TÊN CHỨA 'chuột' =====");
        List<Lab5_Bai1_SanPhan> ketQuaTim = qlsp.timSanPhamTheoTen("chuột");
        for (Lab5_Bai1_SanPhan sp : ketQuaTim) System.out.println(sp);

        // Sắp xếp theo giá tăng dần
        System.out.println("\n===== SẮP XẾP THEO GIÁ TĂNG DẦN =====");
        qlsp.sapXepTheoGia(true);
        qlsp.hienThiTatCa();

        // Sắp xếp theo giá giảm dần
        System.out.println("\n===== SẮP XẾP THEO GIÁ GIẢM DẦN =====");
        qlsp.sapXepTheoGia(false);
        qlsp.hienThiTatCa();

        // Tổng giá trị kho hàng
        System.out.printf("%n===== TỔNG GIÁ TRỊ KHO HÀNG: %,.0f đ =====%n", qlsp.tinhTongGiaTriKho());

        // Sản phẩm sắp hết hàng
        System.out.println("\n===== SẢN PHẨM SẮP HẾT HÀNG (SL < 10) =====");
        List<Lab5_Bai1_SanPhan> sapHetHang = qlsp.lietKeSapHetHang();
        for (Lab5_Bai1_SanPhan sp : sapHetHang) System.out.println(sp);

	}

}
