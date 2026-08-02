
public class Lab2_BaiThucHanh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khai báo biến
		int a = 15;
		int b = 9;
		double c = 3.5;
		
		//Phéo tính
		int tong = a + b;
        double thuong = a / c;
        int phandu = a % b;
        
        //In kết quả
        System.out.println("Tổng: " + tong);
        //format số thực (f = float/double), lấy đúng 2 chữ số sau dấu chấm
        System.out.println("Thương: " + String.format("%.2f", thuong));
        System.out.println("Phần dư: " + phandu);

	}

}
