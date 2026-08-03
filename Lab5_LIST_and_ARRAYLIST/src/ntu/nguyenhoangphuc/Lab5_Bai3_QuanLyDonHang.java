package ntu.nguyenhoangphuc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Lab5_Bai3_QuanLyDonHang {
	private ArrayList<Lab5_Bai3_DonHang> danhSachDH;

    public Lab5_Bai3_QuanLyDonHang() {
        this.danhSachDH = new ArrayList<>();
    }

    // 1. Thêm đơn hàng
    public void themDonHang(Lab5_Bai3_DonHang dh) {
        danhSachDH.add(dh);
    }

    // 2. Tìm đơn hàng có giá trị cao nhất
    public Lab5_Bai3_DonHang timDonHangGiaTriCaoNhat() {
        if (danhSachDH.isEmpty()) return null;
        Lab5_Bai3_DonHang caoNhat = danhSachDH.get(0);
        for (Lab5_Bai3_DonHang dh : danhSachDH) {
            if (dh.getTongTien() > caoNhat.getTongTien()) {
                caoNhat = dh;
            }
        }
        return caoNhat;
    }

    // 3. Thống kê số lượng đơn hàng theo từng khách hàng
    // HashMap<tenKH, soLuongDonHang>
    public Map<String, Integer> thongKeSoLuongTheoKhachHang() {
        Map<String, Integer> thongKe = new HashMap<>();
        for (Lab5_Bai3_DonHang dh : danhSachDH) {
            String ten = dh.getTenKH();
            thongKe.put(ten, thongKe.getOrDefault(ten, 0) + 1);
        }
        return thongKe;
    }

    // 4. Tính tổng doanh thu (cộng dồn tongTien của tất cả đơn hàng)
    public double tinhTongDoanhThu() {
        double tong = 0;
        for (Lab5_Bai3_DonHang dh : danhSachDH) {
            tong += dh.getTongTien();
        }
        return tong;
    }

    // 5. Sắp xếp đơn hàng theo ngày đặt (từ cũ đến mới)
    // Dùng SimpleDateFormat để parse chuỗi "dd/MM/yyyy" thành đối tượng Date rồi so sánh
    public void sapXepTheoNgay() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        danhSachDH.sort((dh1, dh2) -> {
            try {
                Date ngay1 = sdf.parse(dh1.getNgayDat());
                Date ngay2 = sdf.parse(dh2.getNgayDat());
                return ngay1.compareTo(ngay2);
            } catch (ParseException e) {
                // Nếu ngày bị sai định dạng, coi như bằng nhau để không crash chương trình
                System.out.println("Cảnh báo: định dạng ngày không hợp lệ ở đơn " + dh1.getMaDH() + " hoặc " + dh2.getMaDH());
                return 0;
            }
        });
    }

    public void hienThiTatCa() {
        if (danhSachDH.isEmpty()) {
            System.out.println("Chưa có đơn hàng nào.");
            return;
        }
        for (Lab5_Bai3_DonHang dh : danhSachDH) {
            System.out.println(dh);
        }
    }

    public ArrayList<Lab5_Bai3_DonHang> getDanhSachDH() {
        return danhSachDH;
    }

}
