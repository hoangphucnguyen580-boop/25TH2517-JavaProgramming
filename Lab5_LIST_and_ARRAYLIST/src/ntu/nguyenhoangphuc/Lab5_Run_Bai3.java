package ntu.nguyenhoangphuc;

import java.util.Arrays;
import java.util.Map;

public class Lab5_Run_Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab5_Bai3_QuanLyDonHang qldh = new Lab5_Bai3_QuanLyDonHang();

        // Thêm dữ liệu mẫu
        qldh.themDonHang(new Lab5_Bai3_DonHang("DH01", "Nguyên", Arrays.asList("Bàn phím", "Chuột"), 1100000, "10/03/2026"));
        qldh.themDonHang(new Lab5_Bai3_DonHang("DH02", "Lan", Arrays.asList("Màn hình"), 3200000, "05/03/2026"));
        qldh.themDonHang(new Lab5_Bai3_DonHang("DH03", "Nguyên", Arrays.asList("Tai nghe"), 650000, "20/03/2026"));
        qldh.themDonHang(new Lab5_Bai3_DonHang("DH04", "Hùng", Arrays.asList("Bàn di chuột", "Chuột"), 340000, "01/03/2026"));
        qldh.themDonHang(new Lab5_Bai3_DonHang("DH05", "Lan", Arrays.asList("Bàn phím", "Màn hình"), 4050000, "15/03/2026"));

        System.out.println("===== DANH SÁCH ĐƠN HÀNG BAN ĐẦU =====");
        qldh.hienThiTatCa();

        // Đơn hàng có giá trị cao nhất
        System.out.println("\n===== ĐƠN HÀNG CÓ GIÁ TRỊ CAO NHẤT =====");
        Lab5_Bai3_DonHang caoNhat = qldh.timDonHangGiaTriCaoNhat();
        System.out.println(caoNhat);

        // Thống kê số lượng đơn hàng theo khách hàng
        System.out.println("\n===== THỐNG KÊ SỐ ĐƠN HÀNG THEO KHÁCH HÀNG =====");
        Map<String, Integer> thongKe = qldh.thongKeSoLuongTheoKhachHang();
        for (Map.Entry<String, Integer> entry : thongKe.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " đơn");
        }

        // Tổng doanh thu
        System.out.printf("%n===== TỔNG DOANH THU: %,.0f đ =====%n", qldh.tinhTongDoanhThu());

        // Sắp xếp theo ngày đặt
        System.out.println("\n===== ĐƠN HÀNG SAU KHI SẮP XẾP THEO NGÀY (CŨ -> MỚI) =====");
        qldh.sapXepTheoNgay();
        qldh.hienThiTatCa();

	}

}
