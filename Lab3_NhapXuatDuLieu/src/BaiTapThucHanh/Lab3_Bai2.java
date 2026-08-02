package BaiTapThucHanh;
import java.util.Scanner;
public class Lab3_Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// USD => VND: 26,300đ
		Scanner scanner = new Scanner(System.in);
		
		//Nhập giá trị
		System.out.println("1. Quy đổi USD sang VND");
        System.out.println("2. Quy đổi VND sang USD");
        System.out.print("Chọn (1/2): ");
        int chon = scanner.nextInt();

        if (chon == 1) {
        	//Nhập giá trị
            System.out.print("Nhap so tien USD: ");
            double tienUSD = scanner.nextDouble();
            //Chuyển đổi
            double USDtoVND = tienUSD * 26300;
            System.out.printf("%.2f USD = %.0f VND%n", tienUSD, USDtoVND);
        } else if (chon == 2) {
        	//Nhập giá trị
            System.out.print("Nhập sô tiền VND: ");
            double tienVND = scanner.nextDouble();
            double VNDtoUSD = tienVND / 26300;
            System.out.printf("%.0f VND = %.2f USD%n", tienVND, VNDtoUSD);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }
        scanner.close();
	}

}
