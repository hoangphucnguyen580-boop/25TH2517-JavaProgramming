package ntu.nguyenhoangphuc;
import java.util.ArrayList;
import java.util.List;
public class Lab5_BaiThucHanh2_QuanLySinhVien {
	private List<Lab5_BaiThucHanh2> danhSachSV;

    public Lab5_BaiThucHanh2_QuanLySinhVien() {
        danhSachSV = new ArrayList<>();
    }

    public void themSinhVien(Lab5_BaiThucHanh2 sv) {
        danhSachSV.add(sv);
        System.out.println("Đã thêm: " + sv.getHoTen());
    }

    public Lab5_BaiThucHanh2 timTheoMa(String maSV) {
        for (Lab5_BaiThucHanh2 sv : danhSachSV) {
            if (sv.getMaSV().equals(maSV)) return sv;
        }
        return null;
    }

    public Lab5_BaiThucHanh2 timDiemCaoNhat() {
        if (danhSachSV.isEmpty()) return null;
        Lab5_BaiThucHanh2 svCaoNhat = danhSachSV.get(0);
        for (Lab5_BaiThucHanh2 sv : danhSachSV) {
            if (sv.getDiemTB() > svCaoNhat.getDiemTB()) svCaoNhat = sv;
        }
        return svCaoNhat;
    }

    public double tinhDiemTrungBinhLop() {
        if (danhSachSV.isEmpty()) return 0;
        double tong = 0;
        for (Lab5_BaiThucHanh2 sv : danhSachSV) tong += sv.getDiemTB();
        return tong / danhSachSV.size();
    }

    public List<Lab5_BaiThucHanh2> locSinhVienTheoDiem(double diemToiThieu) {
        List<Lab5_BaiThucHanh2> ketQua = new ArrayList<>();
        for (Lab5_BaiThucHanh2 sv : danhSachSV) {
            if (sv.getDiemTB() >= diemToiThieu) ketQua.add(sv);
        }
        return ketQua;
    }

    public void sapXepTheoDiem() {
        // Bubble sort - giảm dần
        for (int i = 0; i < danhSachSV.size() - 1; i++) {
            for (int j = 0; j < danhSachSV.size() - i - 1; j++) {
                if (danhSachSV.get(j).getDiemTB() < danhSachSV.get(j + 1).getDiemTB()) {
                    Lab5_BaiThucHanh2 temp = danhSachSV.get(j);
                    danhSachSV.set(j, danhSachSV.get(j + 1));
                    danhSachSV.set(j + 1, temp);
                }
            }
        }
    }

    public void hienThiDanhSach() {
        if (danhSachSV.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }
        System.out.println("\n=== DANH SÁCH SINH VIÊN ===");
        System.out.println(String.format("%-5s %-8s %-20s %-10s", "STT", "Mã SV", "Họ tên", "Điểm TB"));
        System.out.println("=".repeat(50));
        for (int i = 0; i < danhSachSV.size(); i++) {
            Lab5_BaiThucHanh2 sv = danhSachSV.get(i);
            System.out.println(String.format("%-5d %-8s %-20s %-10.1f", i + 1, sv.getMaSV(), sv.getHoTen(), sv.getDiemTB()));
        }
    }

    public boolean xoaSinhVien(String maSV) {
        for (int i = 0; i < danhSachSV.size(); i++) {
            if (danhSachSV.get(i).getMaSV().equals(maSV)) {
                Lab5_BaiThucHanh2 svBiXoa = danhSachSV.remove(i);
                System.out.println("Đã xóa: " + svBiXoa.getHoTen());
                return true;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã: " + maSV);
        return false;
    }

    public void hienThiHaiSinhVienDauTien() {
        if (danhSachSV.size() >= 2) {
            List<Lab5_BaiThucHanh2> subList = danhSachSV.subList(0, 2);
            System.out.println("\nHai sinh viên đầu tiên:");
            subList.forEach(System.out::println);
        }
    }

}
