package ntu.nguyenhoangphuc;

import java.util.ArrayList;

public class Lab5_Bai5_ThanhVien {
	private String maTV;
    private String tenTV;
    private ArrayList<Lab5_Bai5_TaiLieu> dangMuon;
    private ArrayList<Lab5_Bai5_TaiLieu> lichSuMuon;

    private static final int SO_TAI_LIEU_MUON_TOI_DA = 5;

    public Lab5_Bai5_ThanhVien(String maTV, String tenTV) {
        this.maTV = maTV;
        this.tenTV = tenTV;
        this.dangMuon = new ArrayList<>();
        this.lichSuMuon = new ArrayList<>();
    }

    public String getMaTV() { return maTV; }
    public String getTenTV() { return tenTV; }

    public ArrayList<Lab5_Bai5_TaiLieu> getDangMuon() { return dangMuon; }
    public ArrayList<Lab5_Bai5_TaiLieu> getLichSuMuon() { return lichSuMuon; }

    public void themVaoDangMuon(Lab5_Bai5_TaiLieu tl) {
        dangMuon.add(tl);
        lichSuMuon.add(tl);
    }

    public void xoaKhoiDangMuon(Lab5_Bai5_TaiLieu tl) {
        dangMuon.remove(tl);
    }

    // Điều kiện mượn: mỗi thành viên được mượn tối đa 5 tài liệu cùng lúc
    public boolean daMuonToiDa() {
        return dangMuon.size() >= SO_TAI_LIEU_MUON_TOI_DA;
    }

}
