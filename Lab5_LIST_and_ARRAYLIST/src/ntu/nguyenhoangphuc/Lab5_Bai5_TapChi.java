package ntu.nguyenhoangphuc;

public class Lab5_Bai5_TapChi extends Lab5_Bai5_TaiLieu {
	private String chuDe;

    public Lab5_Bai5_TapChi(String maTL, String tenTL, String chuDe) {
        super(maTL, tenTL);
        this.chuDe = chuDe;
    }

    public String getChuDe() { return chuDe; }

    @Override
    public String layLoaiTaiLieu() { return "Tạp chí"; }

    @Override
    public int laySoNgayMuonToiDa() { return 14; }

}
