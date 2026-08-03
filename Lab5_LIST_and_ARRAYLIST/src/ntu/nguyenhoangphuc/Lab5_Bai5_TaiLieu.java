package ntu.nguyenhoangphuc;

public abstract class Lab5_Bai5_TaiLieu {
	 protected String maTL;
	    protected String tenTL;
	    protected boolean dangDuocMuon;
	    protected int soLanMuon; // đếm số lần đã được mượn -> dùng thống kê "mượn nhiều nhất"

	    public Lab5_Bai5_TaiLieu(String maTL, String tenTL) {
	        this.maTL = maTL;
	        this.tenTL = tenTL;
	        this.dangDuocMuon = false;
	        this.soLanMuon = 0;
	    }

	    public String getMaTL() { return maTL; }
	    public String getTenTL() { return tenTL; }

	    public boolean isDangDuocMuon() { return dangDuocMuon; }
	    public void setDangDuocMuon(boolean dangDuocMuon) { this.dangDuocMuon = dangDuocMuon; }

	    public int getSoLanMuon() { return soLanMuon; }
	    public void setSoLanMuon(int soLanMuon) { this.soLanMuon = soLanMuon; }

	    // Mỗi lớp con override để trả về tên loại của mình (Sách/Báo/Tạp chí)
	    public abstract String layLoaiTaiLieu();

	    // Mỗi loại tài liệu có số ngày mượn tối đa khác nhau
	    public abstract int laySoNgayMuonToiDa();

	    @Override
	    public String toString() {
	        return String.format("[%-7s] %-6s - %-25s | Đã mượn %d lần | %s",layLoaiTaiLieu(), maTL, tenTL, soLanMuon,dangDuocMuon ? "ĐANG ĐƯỢC MƯỢN" : "còn trống");
	    }

}
