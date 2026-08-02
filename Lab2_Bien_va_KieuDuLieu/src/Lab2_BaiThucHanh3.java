
public class Lab2_BaiThucHanh3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BMI = cân nặng (kg) / (chiều cao (m) * chiều cao (m))
		
		//Khai báo biến
		double weight = 62.0;    // kg
        double height = 1.75;    // m
        
        //Tính bmi
        double bmi = weight / (height * height);
        
        //In kết quả
        System.out.println("Cân nặng: " + weight + " kg");
        System.out.println("Chiều cao: " + height + " m");
        System.out.println("Chỉ số BMI: " + bmi);
        
        //Điều kiện phân loại bmi
        if (bmi < 18.5) {
            System.out.println("Phân loại: Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Phân loại: Bình thường");
        } else if (bmi < 30) {
            System.out.println("Phân loại: Thừa cân");
        } else {
            System.out.println("Phân loại: Béo phì");
        }

	}

}
