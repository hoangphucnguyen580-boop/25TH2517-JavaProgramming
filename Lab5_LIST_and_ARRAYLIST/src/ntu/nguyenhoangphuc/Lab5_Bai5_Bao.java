package ntu.nguyenhoangphuc;

public class Lab5_Bai5_Bao extends Lab5_Bai5_TaiLieu {
	private String soPhatHanh;

    public Lab5_Bai5_Bao(String maTL, String tenTL, String soPhatHanh) {
        super(maTL, tenTL);
        this.soPhatHanh = soPhatHanh;
    }

    public String getSoPhatHanh() { return soPhatHanh; }

    @Override
    public String layLoaiTaiLieu() { return "Báo"; }

    @Override
    public int laySoNgayMuonToiDa() { return 3; } 

}
