package ntu.nguyenhoangphuc;

public class Lab5_Bai5_Sach extends Lab5_Bai5_TaiLieu {
	private String tacGia;

    public Lab5_Bai5_Sach(String maTL, String tenTL, String tacGia) {
        super(maTL, tenTL);
        this.tacGia = tacGia;
    }

    public String getTacGia() { return tacGia; }

    @Override
    public String layLoaiTaiLieu() { return "Sách"; }

    @Override
    public int laySoNgayMuonToiDa() { return 30; }

}
