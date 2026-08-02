
public class Lab2_BaiThucHanh4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Tính tiền điện theo bậc thang:
        - 0-50 kWh: 1,678 đ/kWh
        - 51-100 kWh: 1,734 đ/kWh
        - 101-200 kWh: 2,014 đ/kWh
        - 201-300 kWh: 2,536 đ/kWh
        - Trên 300 kWh: 2,834 đ/kWh
     */
     //Khai báo biến
     int sodien = 250;  // kWh
     double tiendien = 0;
     
     //Điều kiện để tính tiền điện
     if (sodien <= 50) {
         tiendien = sodien * 1678;
     } else if (sodien <= 100) {
         tiendien = 50 * 1678 + (sodien - 50) * 1734;
     } else if (sodien <= 200) {
         tiendien = 50 * 1678 + 50 * 1734 + (sodien - 100) * 2014;
     } else if (sodien <= 300) {
         tiendien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (sodien - 200) * 2536;
     } else {
         tiendien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (sodien - 300) * 2834;
     }
     
     //In kết quả
     System.out.println("Số điện: " + sodien + " kWh");
     System.out.println("Tiền điện: " + tiendien + " đồng");
     System.out.println("Tiền điện (VND): " + String.format("%.0f", tiendien) + " đ");

	}

}
