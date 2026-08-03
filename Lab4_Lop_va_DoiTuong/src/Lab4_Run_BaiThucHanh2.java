
public class Lab4_Run_BaiThucHanh2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab4_BaiThucHanh2 hcn1 = new Lab4_BaiThucHanh2(5, 3);
        System.out.println("=== THÔNG TIN HÌNH 1 ===");
        hcn1.hienThiThongTin();

        Lab4_BaiThucHanh2 hcn2 = new Lab4_BaiThucHanh2(4, 4);
        System.out.println("\n=== THÔNG TIN HÌNH 2 ===");
        hcn2.hienThiThongTin();

        System.out.println("\n=== Chiều dài của hcn1 ===");
        hcn1.setChieuDai(10);
        hcn1.hienThiThongTin();

        System.out.println("\n=== Chiệu rộng hcn2 ===");
        hcn2.setChieuRong(-5);
        hcn2.hienThiThongTin();

	}

}
