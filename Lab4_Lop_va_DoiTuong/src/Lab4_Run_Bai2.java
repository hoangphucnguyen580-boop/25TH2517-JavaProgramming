
public class Lab4_Run_Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab4_Bai2 may1 = new Lab4_Bai2("Dell", 16, 512, 15000000);
		Lab4_Bai2 may2 = new Lab4_Bai2("Asus", 4, 256, 8000000);

        System.out.println("=== MÁY 1 ===");
        may1.kiemTraCauHinh();
        System.out.println("Chơi game được không? " + (may1.coTheChoiGame() ? "Có" : "Không"));
        System.out.println("Thuế: " + may1.tinhThue() + " VNĐ");

        System.out.println("\n=== MÁY 2 ===");
        may2.kiemTraCauHinh();
        System.out.println("Chơi game được không? " + (may2.coTheChoiGame() ? "Có" : "Không"));
        System.out.println("Thuế: " + may2.tinhThue() + " VNĐ");

	}

}
