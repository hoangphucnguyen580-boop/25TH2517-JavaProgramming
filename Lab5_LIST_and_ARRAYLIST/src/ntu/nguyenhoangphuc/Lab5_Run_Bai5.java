package ntu.nguyenhoangphuc;

import java.util.List;
import java.util.Map;

public class Lab5_Run_Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab5_Bai5_ThuVien thuVien = new Lab5_Bai5_ThuVien();

        // Thêm tài liệu mẫu (đa hình: TaiLieu tl = new Sach/Bao/TapChi)
        thuVien.themTaiLieu(new Lab5_Bai5_Sach("S01", "Lập trình Java căn bản", "Nguyễn Văn A"));
        thuVien.themTaiLieu(new Lab5_Bai5_Sach("S02", "Cấu trúc dữ liệu và giải thuật", "Trần Thị B"));
        thuVien.themTaiLieu(new Lab5_Bai5_Bao("B01", "Tuổi Trẻ số 45", "45/2026"));
        thuVien.themTaiLieu(new Lab5_Bai5_Bao("B02", "Thanh Niên số 12", "12/2026"));
        thuVien.themTaiLieu(new Lab5_Bai5_TapChi("T01", "Tạp chí Công nghệ", "Công nghệ thông tin"));

        // Thêm thành viên mẫu
        thuVien.themThanhVien(new Lab5_Bai5_ThanhVien("TV01", "Minh"));
        thuVien.themThanhVien(new Lab5_Bai5_ThanhVien("TV02", "Hoa"));

        System.out.println("===== DANH SÁCH TÀI LIỆU BAN ĐẦU =====");
        thuVien.hienThiTatCaTaiLieu();

        // Mượn tài liệu
        System.out.println("\n===== THỰC HIỆN MƯỢN TÀI LIỆU =====");
        thuVien.muonTaiLieu("TV01", "S01");
        thuVien.muonTaiLieu("TV01", "S02");
        thuVien.muonTaiLieu("TV02", "B01");
        thuVien.muonTaiLieu("TV02", "S01"); // sẽ báo lỗi vì S01 đang được mượn

        // Trả tài liệu
        System.out.println("\n===== THỰC HIỆN TRẢ TÀI LIỆU =====");
        thuVien.traTaiLieu("TV01", "S01");

        // Mượn lại sau khi trả -> tăng số lần mượn của S01 lên 2
        thuVien.muonTaiLieu("TV02", "S01");

        // Tìm kiếm theo nhiều tiêu chí
        System.out.println("\n===== TÌM TÀI LIỆU CÓ TÊN CHỨA 'Java' =====");
        List<Lab5_Bai5_TaiLieu> ketQuaTim = thuVien.timKiem("Java", null);
        for (Lab5_Bai5_TaiLieu tl : ketQuaTim) System.out.println(tl);

        System.out.println("\n===== TÌM TÀI LIỆU LOẠI 'Báo' =====");
        for (Lab5_Bai5_TaiLieu tl : thuVien.timKiem(null, "Báo")) System.out.println(tl);

        // Thống kê theo loại
        System.out.println("\n===== THỐNG KÊ TÀI LIỆU THEO LOẠI =====");
        Map<String, Integer> thongKe = thuVien.thongKeTheoLoai();
        for (Map.Entry<String, Integer> entry : thongKe.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Tài liệu mượn nhiều nhất
        System.out.println("\n===== TÀI LIỆU ĐƯỢC MƯỢN NHIỀU NHẤT =====");
        System.out.println(thuVien.layTaiLieuMuonNhieuNhat());

        // Gợi ý tài liệu cho TV01 (đã mượn 2 sách -> gợi ý thêm sách khác)
        System.out.println("\n===== GỢI Ý TÀI LIỆU CHO Minh (TV01) =====");
        List<Lab5_Bai5_TaiLieu> goiY = thuVien.goiYTaiLieu("TV01");
        if (goiY.isEmpty()) {
            System.out.println("Không có gợi ý phù hợp.");
        } else {
            for (Lab5_Bai5_TaiLieu tl : goiY) System.out.println(tl);
        }

	}

}
