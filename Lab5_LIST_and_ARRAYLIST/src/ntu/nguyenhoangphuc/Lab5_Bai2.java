package ntu.nguyenhoangphuc;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5_Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        ArrayList<Integer> danhSachGoc = nhapDanhSach(sc);
        System.out.println("\nDanh sách vừa nhập: " + danhSachGoc);

        // 2. Loại bỏ số trùng lặp (giữ lại 1 lần xuất hiện đầu)
        ArrayList<Integer> khongTrung = loaiBoTrung(danhSachGoc);
        System.out.println("Sau khi loại trùng: " + khongTrung);

        // 3. Tìm số lớn thứ 2 trong danh sách
        Integer lonThu2 = timSoLonThu2(khongTrung);
        System.out.println("Số lớn thứ 2: " + (lonThu2 == null ? "Không đủ phần tử để xác định" : lonThu2));

        // 4. Tính trung bình cộng các số chẵn
        double tbChan = trungBinhSoChan(khongTrung);
        System.out.printf("Trung bình cộng số chẵn: %.2f%n", tbChan);

        // 5. Tách danh sách thành 2: số chẵn và số lẻ
        ArrayList<Integer> soChan = new ArrayList<>();
        ArrayList<Integer> soLe = new ArrayList<>();
        tachChanLe(khongTrung, soChan, soLe);
        System.out.println("Danh sách số chẵn: " + soChan);
        System.out.println("Danh sách số lẻ: " + soLe);

        // 6. Đảo ngược danh sách (KHÔNG dùng Collections.reverse)
        ArrayList<Integer> daoNguoc = daoNguocKhongDungCollections(khongTrung);
        System.out.println("Danh sách sau khi đảo ngược: " + daoNguoc);

        sc.close();
    }

    // 1. Nhập danh sách số nguyên từ người dùng
    public static ArrayList<Integer> nhapDanhSach(Scanner sc) {
        ArrayList<Integer> ds = new ArrayList<>();
        System.out.print("Nhập số lượng phần tử cần nhập: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số nguyên thứ " + (i + 1) + ": ");
            int so = Integer.parseInt(sc.nextLine().trim());
            ds.add(so);
        }
        return ds;
    }

    // 2. Loại bỏ các số trùng lặp, giữ lại lần xuất hiện đầu tiên
    public static ArrayList<Integer> loaiBoTrung(ArrayList<Integer> ds) {
        ArrayList<Integer> ketQua = new ArrayList<>();
        for (int so : ds) {
            // contains() kiểm tra xem số này đã có trong ketQua chưa
            if (!ketQua.contains(so)) {
                ketQua.add(so);
            }
        }
        return ketQua;
    }

    // 3. Tìm số lớn thứ 2 trong danh sách (không dùng sort, duyệt 1 lần)
    public static Integer timSoLonThu2(ArrayList<Integer> ds) {
        if (ds.size() < 2) return null; // không đủ 2 phần tử khác nhau để xác định

        Integer lonNhat = null;
        Integer lonThu2 = null;
        for (int so : ds) {
            if (lonNhat == null || so > lonNhat) {
                lonThu2 = lonNhat; // giá trị lớn nhất cũ tụt xuống vị trí thứ 2
                lonNhat = so;
            } else if (so != lonNhat && (lonThu2 == null || so > lonThu2)) {
                lonThu2 = so;
            }
        }
        return lonThu2;
    }

    // 4. Tính trung bình cộng các số chẵn trong danh sách
    public static double trungBinhSoChan(ArrayList<Integer> ds) {
        int tong = 0, dem = 0;
        for (int so : ds) {
            if (so % 2 == 0) {
                tong += so;
                dem++;
            }
        }
        return dem == 0 ? 0 : (double) tong / dem;
    }

    // 5. Tách danh sách gốc thành 2 danh sách: số chẵn và số lẻ
    // Truyền 2 list rỗng vào để hàm tự đổ dữ liệu vào (tránh phải return 2 giá trị cùng lúc)
    public static void tachChanLe(ArrayList<Integer> ds, ArrayList<Integer> soChan, ArrayList<Integer> soLe) {
        for (int so : ds) {
            if (so % 2 == 0) soChan.add(so);
            else soLe.add(so);
        }
    }

    // 6. Đảo ngược danh sách KHÔNG dùng Collections.reverse()
    // Duyệt từ phần tử cuối về đầu, add lần lượt vào 1 list mới
    public static ArrayList<Integer> daoNguocKhongDungCollections(ArrayList<Integer> ds) {
        ArrayList<Integer> ketQua = new ArrayList<>();
        for (int i = ds.size() - 1; i >= 0; i--) {
            ketQua.add(ds.get(i));
        }
        return ketQua;

	}

}
