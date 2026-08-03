package ntu.nguyenhoangphuc;

public class BTTH_Run_Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTTH_Bai6[] danhSach = new BTTH_Bai6[3];
        danhSach[0] = new BTTH_Bai6("HV001", "Nguyễn Vân Anh", 2003, "Nữ");
        danhSach[1] = new BTTH_Bai6("HV002", "Trần Thị Bích", 2001, "Nữ");
        danhSach[2] = new BTTH_Bai6("HV003", "Lê Văn Ưng", 2004, "Nam");

        System.out.println("----- DANH SÁCH HỌC VIÊN -----");
        for (BTTH_Bai6 hv : danhSach) {
            hv.hienThi();
        }

        // Nam sinh nho nhat = sinh som nhat = nhieu tuoi nhat
        BTTH_Bai6 nhieuTuoiNhat = danhSach[0];
        for (int i = 1; i < danhSach.length; i++) {
            if (danhSach[i].getNamSinh() < nhieuTuoiNhat.getNamSinh()) {
                nhieuTuoiNhat = danhSach[i];
            }
        }

        System.out.println("----- HỌC VIÊN NHIỀU TUỔI NHẤT -----");
        nhieuTuoiNhat.hienThi();

	}

}
