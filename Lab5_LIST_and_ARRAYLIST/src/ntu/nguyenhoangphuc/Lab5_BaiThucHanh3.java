package ntu.nguyenhoangphuc;
import java.util.*;
public class Lab5_BaiThucHanh3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Tạo các loại List
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        List<String> vector = new Vector<>();
        
        // 2. Test tốc độ thêm phần tử ở cuối
        System.out.println("=== TỐC ĐỘ THÊM Ở CUỐI ===");
        
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add("Element " + i);
        }
        long arrayListTime = System.nanoTime() - startTime;
        
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add("Element " + i);
        }
        long linkedListTime = System.nanoTime() - startTime;
        
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            vector.add("Element " + i);
        }
        long vectorTime = System.nanoTime() - startTime;
        
        System.out.printf("ArrayList:  %10d ns\n", arrayListTime);
        System.out.printf("LinkedList: %10d ns\n", linkedListTime);
        System.out.printf("Vector:     %10d ns\n", vectorTime);
        
        // 3. Test tốc độ truy cập ngẫu nhiên
        System.out.println("\n=== TỐC ĐỘ TRUY CẬP NGẪU NHIÊN ===");
        
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i * 10);
        }
        arrayListTime = System.nanoTime() - startTime;
        
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i * 10);
        }
        linkedListTime = System.nanoTime() - startTime;
        
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            vector.get(i * 10);
        }
        vectorTime = System.nanoTime() - startTime;
        
        System.out.printf("ArrayList:  %10d ns (NHANH NHẤT)\n", arrayListTime);
        System.out.printf("LinkedList: %10d ns (CHẬM)\n", linkedListTime);
        System.out.printf("Vector:     %10d ns\n", vectorTime);
        
        // 4. Test tốc độ chèn ở đầu
        System.out.println("\n=== TỐC ĐỘ CHÈN Ở ĐẦU ===");
        
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, "New Element");
        }
        arrayListTime = System.nanoTime() - startTime;
        
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0, "New Element");
        }
        linkedListTime = System.nanoTime() - startTime;
        
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            vector.add(0, "New Element");
        }
        vectorTime = System.nanoTime() - startTime;
        
        System.out.printf("ArrayList:  %10d ns (CHẬM)\n", arrayListTime);
        System.out.printf("LinkedList: %10d ns (NHANH NHẤT)\n", linkedListTime);
        System.out.printf("Vector:     %10d ns\n", vectorTime);
        
        // 5. Đồng bộ hóa
        System.out.println("\n=== ĐỒNG BỘ HÓA (THREAD-SAFE) ===");
        System.out.println("ArrayList:  KHÔNG đồng bộ hóa (nhanh hơn, dùng cho single-thread)");
        System.out.println("LinkedList: KHÔNG đồng bộ hóa");
        System.out.println("Vector:     CÓ đồng bộ hóa (chậm hơn, dùng cho multi-thread)");
        
        // 6. Tóm tắt
        System.out.println("\n=== TÓM TẮT - KHI NÀO DÙNG CÁI NÀO? ===");
        System.out.println("Dùng ArrayList khi:");
        System.out.println("  - Truy cập ngẫu nhiên nhiều (get, set)");
        System.out.println("  - Thêm/xóa chủ yếu ở cuối danh sách");
        System.out.println("  - Ứng dụng single-thread");
        
        System.out.println("\nDùng LinkedList khi:");
        System.out.println("  - Thêm/xóa ở đầu hoặc giữa danh sách nhiều");
        System.out.println("  - Cần hàng đợi (Queue) hoặc ngăn xếp (Stack)");
        System.out.println("  - Không cần truy cập ngẫu nhiên thường xuyên");
        
        System.out.println("\nDùng Vector khi:");
        System.out.println("  - Cần thread-safety (multi-thread)");
        System.out.println("  - Tương thích với code cũ (Java 1.0)");

	}

}
