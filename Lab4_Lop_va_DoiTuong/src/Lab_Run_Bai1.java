
public class Lab_Run_Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo 3 đối tượng sách khác nhau theo đúng yêu cầu đề bài
		Lab4_Bai1 s1 = new Lab4_Bai1("Java Cơ Bản", "Nguyễn Văn A", 120000, 350);
		Lab4_Bai1 s2 = new Lab4_Bai1("Lập Trình Hướng Đối Tượng", "Trần Thị B", 150000, 420);
		Lab4_Bai1 s3 = new Lab4_Bai1("Cấu Trúc Dữ Liệu", "Lê Văn C", 180000, 500);

        System.out.println("=== SÁCH 1 ===");
        s1.hienThiThongTin();

        System.out.println("\n=== SÁCH 2 ===");
        s2.hienThiThongTin();

        System.out.println("\n=== SÁCH 3 ===");
        s3.hienThiThongTin();

	}

}
