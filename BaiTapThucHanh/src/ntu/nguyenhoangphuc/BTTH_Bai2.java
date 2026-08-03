package ntu.nguyenhoangphuc;

import java.util.Scanner;
public class BTTH_Bai2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Nhập giá trị
		 System.out.print("Nhập cạnh thứ nhất (chiều dài): ");
	     double a = scanner.nextDouble();

	     System.out.print("Nhập cạnh thứ hai (chiều rộng): ");
	     double b = scanner.nextDouble();

	     //Tính toán
	     double chuVi = 2 * (a + b);
	     double dienTich = a * b;
	     double canhNho = Math.min(a, b);

	     //In kết quả
	     System.out.println("Chu vi: " + chuVi);
	     System.out.println("Diện tích: " + dienTich);
	     System.out.println("Cạnh nhỏ: " + canhNho);

	     scanner.close();

	}

}
