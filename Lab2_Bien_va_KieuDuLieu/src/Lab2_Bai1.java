import java.util.Scanner;
public class Lab2_Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nhập dữ liệu
		System.out.print("Nhập sô giờ làm: ");
		Scanner giolam = new Scanner(System.in);
		double sogiolam = giolam.nextDouble();
		
		System.out.print("Nhập lương theo giờ: ");
		Scanner luong = new Scanner(System.in);
		double luonggio = luong.nextDouble();
		
		//Khai báo biến
		double tongluong;
		
		// Nếu làm <= 40 giờ: tính bình thường
        if (sogiolam <= 40) {
            tongluong = sogiolam * luonggio;
        }else {
        // 40 giờ đầu tính bình thường, phần vượt 40 tính 1.5 lần
        	double giovuot = sogiolam - 40;
            tongluong = (40 * luonggio) + (giovuot * luonggio * 1.5);
        }
        
        //In kết quả
        System.out.printf("Tong luong: %.0f VND", tongluong);

	}

}
