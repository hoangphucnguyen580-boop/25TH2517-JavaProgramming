package BaiTapThucHanh;
import java.util.Scanner;
public class Lab3_Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Bảng giá điện sinh hoạt 5 bậc (chưa gồm VAT)
		//Bậc 1 (0 - 100 kWh): 1.984 đồng/kWh
		//Bậc 2 (101 - 200 kWh): 2.380 đồng/kWh
		//Bậc 3 (201 - 400 kWh): 2.998 đồng/kWh
		//Bậc 4 (401 - 700 kWh): 3.571 đồng/kWh
		//Bậc 5 (Từ 701 kWh trở lên): 3.967 đồng/kWh
		
		//Nhập dữ liệu
		System.out.print("Nhập số điện tiêu thụ (kWh): ");
        double sodien = scanner.nextDouble();
        
        //Khai báo biến
        double tiendien = 0;
        
        //Điều kiện
        if (sodien <= 100) {	
        	tiendien = sodien * 1984;
        } else if (sodien <= 200) {
        	tiendien = 100 * 1984 + (sodien - 100) * 2380;
        } else if  (sodien <= 400) {
        	tiendien = 100 * 1984 + 100 * 2380 + (sodien - 200) * 2998;
        } else if (sodien <= 700) {
        	tiendien = 100* 1984 + 100 * 2380 + 200 * 2998 + (sodien - 400) * 3571;
        } else {
        	tiendien = 100* 1984 + 100 * 2380 + 200 * 2998 + 300 * 3571 + (sodien - 700) * 3967;
        }
        
        //In kết quả
        System.out.printf("Số điện: %.0f kWh %n", sodien);
        System.out.printf("Tiền điện: %.0f VND %n", tiendien);
        scanner.close();
	}

}
