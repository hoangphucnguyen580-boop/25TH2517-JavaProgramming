
public class Lab4_Bai2 {
	//Khai báo thuộc tính
	private String hang;
    private int ram;    // đơn vị GB
    private int oCung;  // đơn vị GB
    private double gia;

    public Lab4_Bai2(String hang, int ram, int oCung, double gia) {
        this.hang = hang;
        this.ram = ram;
        this.oCung = oCung;
        this.gia = gia;
    }

 // Getter/setter cho Hãng
    public String getHang() { return hang; }
    public void setHang(String hang) { this.hang = hang; }

 // Getter/setter cho Ram
    public int getRam() { return ram; }
    public void setRam(int ram) {
        if (ram > 0) this.ram = ram;
        else System.out.println("RAM phải lớn hơn 0!");
    }

    public int getOCung() { return oCung; }
    public void setOCung(int oCung) {
        if (oCung > 0) this.oCung = oCung;
        else System.out.println("Ổ cứng phải lớn hơn 0!");
    }

    public double getGia() { return gia; }
    public void setGia(double gia) {
        if (gia > 0) this.gia = gia;
        else System.out.println("Giá phải lớn hơn 0!");
    }

    // In ra thông số cấu hình
    public void kiemTraCauHinh() {
        System.out.println("Hãng: " + hang);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Ổ cứng: " + oCung + "GB");
        System.out.println("Giá: " + gia + " VNĐ");
    }

    // Trả về true nếu RAM >= 8GB
    public boolean coTheChoiGame() {
        return ram >= 8;
    }

    // Tính thuế 10% của giá
    public double tinhThue() {
        return gia * 0.1;
    }

}
