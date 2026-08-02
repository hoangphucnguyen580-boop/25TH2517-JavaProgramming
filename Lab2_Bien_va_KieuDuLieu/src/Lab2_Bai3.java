import java.util.Scanner;
public class Lab2_Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nhập dữ liệu
		System.out.print("Nhap a: ");
		Scanner a = new Scanner(System.in);
        double giatria = a.nextDouble();

        System.out.print("Nhap b: ");
        Scanner b = new Scanner(System.in);
        double giatrib = b.nextDouble();
        
        //Xét các trường hợp
        if (giatria == 0) {
            if (giatrib == 0) {
                // 0x + 0 = 0 -> đúng với mọi x
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                // 0x + b = 0 (b != 0) -> vô lý
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            // a != 0 -> nghiệm duy nhất x = -b/a
            double x = -giatrib / giatria;
            System.out.printf("Phuong trinh co nghiem: x = %.2f", x);
        }

	}

}
