
public class Lab4_Run_BaiThucHanh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab4_BaiThucHanh1 xe1 = new Lab4_BaiThucHanh1();
        // Dùng setter thay vì gán trực tiếp vì field đã private
        xe1.setHangXe("Toyota");
        xe1.setMauSac("Đỏ");
        // Không set trực tiếp tocDoHienTai được nữa vì không có setter (cố ý,
        // vì tốc độ chỉ nên đổi qua tangToc()/phanh() để logic nhất quán)

        Lab4_BaiThucHanh1 xe2 = new Lab4_BaiThucHanh1();
        xe2.setHangXe("Honda");
        xe2.setMauSac("Trắng");

        System.out.println("=== THÔNG TIN XE 1 ===");
        xe1.hienThiThongTin();
        xe1.tangToc(30);

        System.out.println("\n=== THÔNG TIN XE 2 ===");
        xe2.hienThiThongTin();
        xe2.tangToc(60);
        xe2.phanh();
	}

}
