package BaiTapThucHanh;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
public class Lab3_Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("===== CHUONG TRINH NHAT KY CA NHAN =====");
		
		System.out.print("Tiêu đề nhật ký: ");
        String tieude = scanner.nextLine();
        
        //Lấy ngày tiếng năm hiện tại trên máy
        LocalDate homnay = LocalDate.now();
        
        System.out.print("Nội dung nhật ký: ");
        String noidung = scanner.nextLine();
        
        try {
        	FileWriter nhatky = new FileWriter("nhatky.txt", true);
        	nhatky.write("=== SINH VIÊN ===\n");
        	nhatky.write("Tiêu đề: " + tieude + "\n");
        	nhatky.write("Ngày: " + homnay + "\n");
        	nhatky.write("Nội dung: " + noidung + "\n");
        	nhatky.write("=================\n\n");
        	nhatky.close();
        	 System.out.println("\nĐã lưu thông tin vào file nhatky.txt");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
        scanner.close();
        
        System.out.println("\n=== Đọc bằng Nhật ký ===");
        try {
            Scanner fileScanner = new Scanner(new java.io.File("nhatky.txt"));
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

	}

}
