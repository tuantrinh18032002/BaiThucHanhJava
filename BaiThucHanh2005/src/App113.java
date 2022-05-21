import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App113 {
    public static void main(String[] args) {
        String fruitName;
        int n;
        Scanner scanner = new Scanner(System.in);
        // tạo 1 HashSet có tên là hashSetFruits
        HashSet<String> hashSetFruits = new HashSet<String>();
        System.out.println("Nhap so phan tu cua hashSetFruits: ");
        n = scanner.nextInt();
        System.out.println("Nhap vao ten cac loai trai cay: ");
        for(int i=0;i<n;i++){
            System.out.println("Nhap ten loai trai cay thu "+i+": ");
            fruitName = scanner.nextLine();
            hashSetFruits.add(fruitName);
        }
        // hiển thị số phần tử của hashSetFruits
        System.out.println("So phan tu cua hashSetFruits = "+hashSetFruits.size());
        // tìm loại trái cây
        System.out.println("Nhap ten loai trai cay can tim: ");
        String fruitSearch = scanner.nextLine();
        if(hashSetFruits.contains(fruitSearch)){
            System.out.println("Co trai cay "+fruitSearch+" trong hashSetFruits");
        }else{
            System.out.println("Khong tim thay "+fruitSearch);
        }
        // xóa 1 loại trái cây bất kỳ
        System.out.println("Nhap vao ten loai trai cay can xoa: ");
        String fruitDelete = scanner.nextLine();
        if(hashSetFruits.contains(fruitSearch)){
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai trong hashSetFruits: "+hashSetFruits);
        }else{
            System.out.println("Xoa khong thanh cong!");
        }
        // tạo 1 List mới có cùng kiểu dữ liệu với HashSet và thêm các phần tử của List này
        List<String> listFruits = new ArrayList<>();
        listFruits.add("Apple");
        listFruits.add("Banana");
        listFruits.add("Mango");
        listFruits.add("Apple");
        // thêm các phần tử của List này vào trong HashSet ban đầu
        hashSetFruits.addAll(listFruits);
        System.out.println("Cac phan tu co trong hashSetFruits sau khi them: ");
        Iterator<String> iterator = hashSetFruits.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+"\t");
        }
        // xóa các phần tử của List có trong HashSet
        hashSetFruits.removeAll(listFruits);
        System.out.println("Cac phan tu co trong hashSetFruits sau khi xoa: "+hashSetFruits);
    }
    
}
