package ntu.nguyenhoangphuc;

import java.util.Scanner;

public class BTTH_Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 
		 //Nhập giá trị
		 System.out.print("Nhap họ và tên sinh viên: ");
	     String hoTen = scanner.nextLine();
	        
	     System.out.print("Nhập điểm Toán: ");
	     double toan = scanner.nextDouble();
	        
	     System.out.print("Nhập điểm Văn: ");
	     double van = scanner.nextDouble();
	        
	     System.out.print("Nhập điểm Anh: ");
	     double anh = scanner.nextDouble();
	        
	     double dtb = (toan + van + anh) / 3;
	     
	     //In kết quả
	     System.out.println("----- THÔNG TIN SINH VIÊN -----");
	     System.out.println("Họ và tên: " + hoTen);
	     System.out.println("Điểm Toán: " + toan);
	     System.out.println("Điểm Văn: " + van);
	     System.out.println("Điểm Anh: " + anh);
	     System.out.println("Diem trung binh: " + String.format("%.2f", dtb));
	     
	     scanner.close();
	}

}
