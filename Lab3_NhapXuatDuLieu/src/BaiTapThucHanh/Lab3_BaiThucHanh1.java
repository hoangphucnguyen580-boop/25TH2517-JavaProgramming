package BaiTapThucHanh;
import java.util.Scanner;
public class Lab3_BaiThucHanh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();
        
        double sum = num1 + num2;
        System.out.printf("Tổng của %.2f và %.2f là: %.2f%n", num1, num2, sum);
        
        scanner.close();

	}

}
