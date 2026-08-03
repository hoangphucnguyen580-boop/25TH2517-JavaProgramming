
public class Lab4_Run_Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab4_Bai3 tk1 = new Lab4_Bai3("001", "Nguyễn Văn A", 1000000);
		Lab4_Bai3 tk2 = new Lab4_Bai3("002", "Trần Thị B", 500000);

        System.out.println("=== SỐ DƯ BAN ĐẦU ===");
        tk1.hienThiSoDu();
        tk2.hienThiSoDu();

        System.out.println("\n=== GỬI TIỀN ===");
        tk1.guiTien(200000);
        tk1.hienThiSoDu();

        System.out.println("\n=== RÚT TIỀN ===");
        tk2.rutTien(100000);
        tk2.hienThiSoDu();

        System.out.println("\n=== RÚT TIỀN KHÔNG ĐỦ SỐ DƯ (test) ===");
        tk2.rutTien(10000000);
        tk2.hienThiSoDu();

        System.out.println("\n=== CHUYỂN TIỀN ===");
        tk1.chuyenTien(tk2, 300000);
        tk1.hienThiSoDu();
        tk2.hienThiSoDu();

	}

}
