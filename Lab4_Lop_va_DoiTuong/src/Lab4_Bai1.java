
public class Lab4_Bai1 {
	//Khai báo thuộc tính
	private String tieuDe;
    private String tacGia;
    private double gia;
    private int soTrang;

    public Lab4_Bai1(String tieuDe, String tacGia, double gia, int soTrang) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.gia = gia;
        this.soTrang = soTrang;
    }
    
 // Getter/setter cho Tiêu đề
    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

 // Getter/setter cho Tác giả
    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

 // Getter/setter cho Giá
    public double getGia() { return gia; }
    public void setGia(double gia) {
        if (gia > 0) this.gia = gia;
        else System.out.println("Giá sách phải lớn hơn 0!");
    }

 // Getter/setter cho Số trang
    public int getSoTrang() { return soTrang; }
    public void setSoTrang(int soTrang) {
        if (soTrang > 0) this.soTrang = soTrang;
        else System.out.println("Số trang phải lớn hơn 0!");
    }

    // Hiển thị tất cả thông tin sách
    public void hienThiThongTin() {
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Giá: " + gia + " VNĐ");
        System.out.println("Số trang: " + soTrang);
    }

}
