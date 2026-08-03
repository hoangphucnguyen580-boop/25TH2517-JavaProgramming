package ntu.nguyenhoangphuc;

import java.util.Scanner;

public class BTTH_Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Khai báo biến
        System.out.print("Nhập chiều cao (met, vd 1,65): ");
        double chieuCao = scanner.nextDouble();

        System.out.print("Nhậpp cân nặng (kg): ");
        double canNang = scanner.nextDouble();

        double bmi = canNang / (chieuCao * chieuCao); // cong thuc BMI chuan

        String tinhTrang;
        // Nguong danh gia rieng cho nguoi Chau A
        if (bmi < 18.5) {
            tinhTrang = "Gày (thiếu cân)";
        } else if (bmi < 23) {
            tinhTrang = "Bình thường";
        } else if (bmi < 25) {
            tinhTrang = "Thừa cân";
        } else if (bmi < 30) {
            tinhTrang = "Béo phì độ I";
        } else {
            tinhTrang = "Béo phì độ II";
        }

        System.out.printf("Chi so BMI: %.2f%n", bmi);
        System.out.println("Tinh trang: " + tinhTrang);

        scanner.close();

	}

}
