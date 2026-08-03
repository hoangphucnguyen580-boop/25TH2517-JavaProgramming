package ntu.nguyenhoangphuc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab5_Bai5_ThuVien {
	private ArrayList<Lab5_Bai5_TaiLieu> danhSachTaiLieu;
    private ArrayList<Lab5_Bai5_ThanhVien> danhSachThanhVien;

    public Lab5_Bai5_ThuVien() {
        this.danhSachTaiLieu = new ArrayList<>();
        this.danhSachThanhVien = new ArrayList<>();
    }

    public void themTaiLieu(Lab5_Bai5_TaiLieu tl) { danhSachTaiLieu.add(tl); }
    public void themThanhVien(Lab5_Bai5_ThanhVien tv) { danhSachThanhVien.add(tv); }

    //1. Mượn / trả tài liệu (kiểm tra điều kiện)
    public boolean muonTaiLieu(String maTV, String maTL) {
    	Lab5_Bai5_ThanhVien tv = timThanhVienTheoMa(maTV);
        Lab5_Bai5_TaiLieu tl = timTaiLieuTheoMa(maTL);

        if (tv == null) { System.out.println("Không tìm thấy thành viên mã " + maTV); return false; }
        if (tl == null) { System.out.println("Không tìm thấy tài liệu mã " + maTL); return false; }
        if (tl.isDangDuocMuon()) { System.out.println("Tài liệu \"" + tl.getTenTL() + "\" đang được người khác mượn."); return false; }
        if (tv.daMuonToiDa()) { System.out.println(tv.getTenTV() + " đã mượn tối đa tài liệu, không thể mượn thêm."); return false; }

        tl.setDangDuocMuon(true);
        tl.setSoLanMuon(tl.getSoLanMuon() + 1);
        tv.themVaoDangMuon(tl);
        System.out.println(tv.getTenTV() + " mượn thành công: " + tl.getTenTL()
                + " (hạn mượn tối đa " + tl.laySoNgayMuonToiDa() + " ngày)");
        return true;
    }

    public boolean traTaiLieu(String maTV, String maTL) {
    	Lab5_Bai5_ThanhVien tv = timThanhVienTheoMa(maTV);
        Lab5_Bai5_TaiLieu tl = timTaiLieuTheoMa(maTL);

        if (tv == null) { System.out.println("Không tìm thấy thành viên mã " + maTV); return false; }
        if (tl == null) { System.out.println("Không tìm thấy tài liệu mã " + maTL); return false; }
        if (!tl.isDangDuocMuon() || !tv.getDangMuon().contains(tl)) {
            System.out.println(tv.getTenTV() + " không mượn tài liệu này nên không thể trả.");
            return false;
        }

        tl.setDangDuocMuon(false);
        tv.xoaKhoiDangMuon(tl);
        System.out.println(tv.getTenTV() + " đã trả: " + tl.getTenTL());
        return true;
    }

    //2. Tìm kiếm tài liệu theo nhiều tiêu chí (tên gần đúng và/hoặc loại)
    public List<Lab5_Bai5_TaiLieu> timKiem(String tuKhoaTen, String loai) {
        List<Lab5_Bai5_TaiLieu> ketQua = new ArrayList<>();
        for (Lab5_Bai5_TaiLieu tl : danhSachTaiLieu) {
            boolean khopTen = (tuKhoaTen == null || tuKhoaTen.isEmpty())
                    || tl.getTenTL().toLowerCase().contains(tuKhoaTen.toLowerCase());
            boolean khopLoai = (loai == null || loai.isEmpty())
                    || tl.layLoaiTaiLieu().equalsIgnoreCase(loai);
            if (khopTen && khopLoai) {
                ketQua.add(tl);
            }
        }
        return ketQua;
    }

    //3. Thống kê tài liệu theo loại
    public Map<String, Integer> thongKeTheoLoai() {
        Map<String, Integer> thongKe = new HashMap<>();
        for (Lab5_Bai5_TaiLieu tl : danhSachTaiLieu) {
            String loai = tl.layLoaiTaiLieu();
            thongKe.put(loai, thongKe.getOrDefault(loai, 0) + 1);
        }
        return thongKe;
    }

    //4. Tài liệu được mượn nhiều nhất
    public Lab5_Bai5_TaiLieu layTaiLieuMuonNhieuNhat() {
        if (danhSachTaiLieu.isEmpty()) return null;
        Lab5_Bai5_TaiLieu nhieuNhat = danhSachTaiLieu.get(0);
        for (Lab5_Bai5_TaiLieu tl : danhSachTaiLieu) {
            if (tl.getSoLanMuon() > nhieuNhat.getSoLanMuon()) {
                nhieuNhat = tl;
            }
        }
        return nhieuNhat;
    }

    //5. Gợi ý tài liệu dựa trên lịch sử mượn
    public List<Lab5_Bai5_TaiLieu> goiYTaiLieu(String maTV) {
        List<Lab5_Bai5_TaiLieu> goiY = new ArrayList<>();
        Lab5_Bai5_ThanhVien tv = timThanhVienTheoMa(maTV);
        if (tv == null || tv.getLichSuMuon().isEmpty()) {
            return goiY; // chưa có lịch sử -> chưa đủ dữ liệu để gợi ý
        }

        Map<String, Integer> demTheoLoai = new HashMap<>();
        for (Lab5_Bai5_TaiLieu tl : tv.getLichSuMuon()) {
            String loai = tl.layLoaiTaiLieu();
            demTheoLoai.put(loai, demTheoLoai.getOrDefault(loai, 0) + 1);
        }
        String loaiUaThich = Collections.max(demTheoLoai.entrySet(), Map.Entry.comparingByValue()).getKey();

        for (Lab5_Bai5_TaiLieu tl : danhSachTaiLieu) {
            if (tl.layLoaiTaiLieu().equals(loaiUaThich)
                    && !tl.isDangDuocMuon()
                    && !tv.getLichSuMuon().contains(tl)) {
                goiY.add(tl);
            }
        }
        return goiY;
    }

    //Hàm hỗ trợ tìm kiếm nội bộ
    private Lab5_Bai5_TaiLieu timTaiLieuTheoMa(String maTL) {
        for (Lab5_Bai5_TaiLieu tl : danhSachTaiLieu) {
            if (tl.getMaTL().equals(maTL)) return tl;
        }
        return null;
    }

    private Lab5_Bai5_ThanhVien timThanhVienTheoMa(String maTV) {
        for (Lab5_Bai5_ThanhVien tv : danhSachThanhVien) {
            if (tv.getMaTV().equals(maTV)) return tv;
        }
        return null;
    }

    public void hienThiTatCaTaiLieu() {
        for (Lab5_Bai5_TaiLieu tl : danhSachTaiLieu) {
            System.out.println(tl);
        }
    }

}
