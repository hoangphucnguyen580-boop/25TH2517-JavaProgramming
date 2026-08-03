package ntu.nguyenhoangphuc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab5_Bai4_LogicTroChoi {
	 private ArrayList<Lab5_Bai4_Card> danhSachLa;
	    private int soLanLat; // số lượt lật (1 lượt = lật 2 lá)
	    private Scanner sc;

	    public Lab5_Bai4_LogicTroChoi() {
	        danhSachLa = new ArrayList<>();
	        soLanLat = 0;
	        sc = new Scanner(System.in);
	        khoiTaoBai();
	    }

	    // 2. Khởi tạo danh sách 8 cặp bài (16 lá), xáo trộn ngẫu nhiên
	    private void khoiTaoBai() {
	        for (int giaTri = 1; giaTri <= 8; giaTri++) {
	            danhSachLa.add(new Lab5_Bai4_Card(giaTri));
	            danhSachLa.add(new Lab5_Bai4_Card(giaTri)); // thêm 2 lần -> tạo thành 1 cặp
	        }
	        // Collections.shuffle xáo trộn ngẫu nhiên vị trí các phần tử trong ArrayList
	        Collections.shuffle(danhSachLa);
	    }

	    // 3. Hiển thị bảng 4x4 (lá đang lật/đã ghép cặp thì hiện số, còn lại hiện "?")
	    private void hienThiBang() {
	        System.out.println("\n--- BẢNG BÀI (4x4) ---");
	        for (int i = 0; i < danhSachLa.size(); i++) {
	        	Lab5_Bai4_Card la = danhSachLa.get(i);
	            String hienThi = (la.isDaTimThayCap() || la.isDaLat()) ? String.valueOf(la.getGiaTri()) : "?";
	            System.out.printf("[%2d:%s]", i, hienThi);
	            if ((i + 1) % 4 == 0) {
	                System.out.println();
	            } else {
	                System.out.print(" ");
	            }
	        }
	    }

	    // 4 + 5. Cho người chơi chọn 2 lá để lật, kiểm tra khớp hay không
	    private void luotChoi() {
	        int viTri1 = nhapViTriHopLe("Chọn lá thứ nhất (0-15): ");
	        danhSachLa.get(viTri1).setDaLat(true);
	        hienThiBang();

	        int viTri2 = nhapViTriHopLe("Chọn lá thứ hai (0-15, khác lá vừa chọn): ", viTri1);
	        danhSachLa.get(viTri2).setDaLat(true);
	        hienThiBang();

	        soLanLat++;

	        Lab5_Bai4_Card la1 = danhSachLa.get(viTri1);
	        Lab5_Bai4_Card la2 = danhSachLa.get(viTri2);

	        if (la1.getGiaTri() == la2.getGiaTri()) {
	            System.out.println(">> Trùng khớp! Giữ nguyên trạng thái mở.");
	            la1.setDaTimThayCap(true);
	            la2.setDaTimThayCap(true);
	        } else {
	            System.out.println(">> Không khớp, úp lại 2 lá.");
	            la1.setDaLat(false);
	            la2.setDaLat(false);
	        }
	    }

	    // Nhập vị trí hợp lệ, không trùng vị trí đã chọn trước đó trong cùng lượt (viTriTruoc = -1 nếu không cần kiểm tra)
	    private int nhapViTriHopLe(String thongBao) {
	        return nhapViTriHopLe(thongBao, -1);
	    }

	    private int nhapViTriHopLe(String thongBao, int viTriTruoc) {
	        int viTri;
	        while (true) {
	            System.out.print(thongBao);
	            try {
	                viTri = Integer.parseInt(sc.nextLine().trim());
	            } catch (NumberFormatException e) {
	                System.out.println("Vui lòng nhập số nguyên.");
	                continue;
	            }

	            if (viTri < 0 || viTri >= danhSachLa.size()) {
	                System.out.println("Vị trí không hợp lệ, nhập lại.");
	            } else if (danhSachLa.get(viTri).isDaTimThayCap()) {
	                System.out.println("Lá này đã được ghép cặp rồi, chọn lá khác.");
	            } else if (viTri == viTriTruoc) {
	                System.out.println("Mày vừa chọn lá này rồi, chọn lá khác đi.");
	            } else {
	                break;
	            }
	        }
	        return viTri;
	    }

	    // 6. Kiểm tra kết thúc game khi tất cả lá đã được ghép cặp
	    private boolean daHoanThanh() {
	        for (Lab5_Bai4_Card la : danhSachLa) {
	            if (!la.isDaTimThayCap()) return false;
	        }
	        return true;
	    }

	    // 7. Tính điểm dựa trên số lần lật: tối thiểu cần 8 lượt (khớp ngay từ đầu),
	    // càng lật nhiều lượt dư ra thì càng bị trừ điểm.
	    private int tinhDiem() {
	        int diem = 1000 - (soLanLat - 8) * 20;
	        return Math.max(diem, 0);
	    }

	    public void batDauChoi() {
	        System.out.println("=== TRÒ CHƠI LẬT BÀI TRÍ NHỚ (MEMORY GAME) ===");
	        System.out.println("Có 8 cặp lá (16 lá tổng), mỗi lượt chọn 2 vị trí để lật.");

	        while (!daHoanThanh()) {
	            hienThiBang();
	            luotChoi();
	        }

	        hienThiBang();
	        System.out.println("\nChúc mừng! Mày đã lật hết tất cả các cặp!");
	        System.out.println("Tổng số lượt lật: " + soLanLat);
	        System.out.println("Điểm số: " + tinhDiem());
	        sc.close();
	    }

}
