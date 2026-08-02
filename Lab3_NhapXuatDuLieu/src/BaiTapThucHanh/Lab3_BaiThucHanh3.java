package BaiTapThucHanh;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab3_BaiThucHanh3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== NHẬP THÔNG TIN SINH VIÊN ===");
        System.out.print("Mã sinh viên: ");
        String id = scanner.nextLine();
        
        System.out.print("Họ tên: ");
        String name = scanner.nextLine();
        
        System.out.print("Điểm Toán: ");
        double math = scanner.nextDouble();
        
        System.out.print("Điểm Lý: ");
        double physics = scanner.nextDouble();
        
        System.out.print("Điểm Hóa: ");
        double chemistry = scanner.nextDouble();
        
        double average = (math + physics + chemistry) / 3;
        
        // Ghi vào file
        try {
            FileWriter writer = new FileWriter("students.txt", true);
            writer.write("=== SINH VIÊN ===\n");
            writer.write("Mã SV: " + id + "\n");
            writer.write("Họ tên: " + name + "\n");
            writer.write(String.format("Điểm Toán: %.1f\n", math));
            writer.write(String.format("Điểm Lý: %.1f\n", physics));
            writer.write(String.format("Điểm Hóa: %.1f\n", chemistry));
            writer.write(String.format("Điểm TB: %.2f\n", average));
            writer.write("=================\n\n");
            writer.close();
            
            System.out.println("\nĐã lưu thông tin vào file students.txt");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
        
        scanner.close();
        
        System.out.println("\n=== Đọc bằng Scanner ===");
        try {
            Scanner fileScanner = new Scanner(new java.io.File("students.txt"));
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

	}

}
