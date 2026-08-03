package ntu.nguyenhoangphuc;

import java.util.Scanner;

public class BTTH_Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();

        double theTich = Math.pow(canh, 3);

        System.out.println("Thể tích khối lập phương: " + theTich);

        scanner.close();

	}

}
