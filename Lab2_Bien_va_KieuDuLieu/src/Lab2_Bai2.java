import java.util.Scanner;
public class Lab2_Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Giá quy đổi cố định
        final double ty_gia_usd = 23500;
        final double ty_gia_eur = 27000;
        
        //Nhập dữ liệu
        System.out.print("Nhap so tien USD: ");
        Scanner usd = new Scanner(System.in);
        double tienUSD = usd.nextDouble();
        
        System.out.print("Nhap so tien EUR: ");
        Scanner eur = new Scanner(System.in);
        double tienEUR = eur.nextDouble();
        
        //Chuyển đổi
        double USDsangVND = tienUSD * ty_gia_usd;
        
        double EURsangVND = tienEUR * ty_gia_eur;
        
        //In kết quả
		System.out.printf("%.2f USD = %.0f VND%n", tienUSD, USDsangVND);
		System.out.printf("%.2f EUR = %.0f VND%n", tienEUR, EURsangVND);
	}

}
