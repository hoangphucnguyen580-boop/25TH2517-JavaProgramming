package ntu.nguyenhoangphuc;

import java.util.Scanner;

public class BTTH__Run_Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mẵ học viên: ");
        String ma = scanner.nextLine();

        System.out.print("Nhập họ tên đầy đủ: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập năm sinh: ");
        int namSinh = scanner.nextInt();
        scanner.nextLine(); // doc bo ky tu xuong dong con sot sau nextInt(), tranh loi lech dong khi doc chuoi tiep

        System.out.print("Nhập giới tính (Nam/Nữ): ");
        String gioiTinh = scanner.nextLine();

        BTTH_Bai5 hv = new BTTH_Bai5(ma, hoTen, namSinh, gioiTinh);

        System.out.println("----- THÔNG TIN HỌC VIÊN VỪA NHẬP -----");
        hv.hienThi();

        scanner.close();

	}

}
