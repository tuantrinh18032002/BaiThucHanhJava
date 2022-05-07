import java.util.Scanner;
import java.util.LinkedList;
public class App41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        list.add("thang 1");
        list.add("thang 2");
        list.add("thang 3");
        list.add("thang 4");
        list.add("thang 5");
        list.add("thang 6");
        list.add("thang 7");
        list.add("thang 8");
        list.add("thang 9");
        list.add("thang 10");
        list.add("thang 11");
        list.add("thang 12");
        System.out.println("nhap vao chi so cua phan tu can lay: ");
        int index = sc.nextInt();
        if(index < 0 || index > list.size() -1) {
            System.out.println("chi so can lay phai nho hon 0 va lon hon "+ (list.size()-1));
        }
        else {
            String node = list.get(index);
            System.out.println("phan tu co chi so = "+ index + "trong LinkedList la" +node);
        }
        String firstNode = list.getFirst();
        String lastNode  = list.getLast();
        System.out.println("\nphan tu dau tien trong danh sach la " +firstNode + "Phan tu cuoi cua danh sach "+lastNode);
        sc.close();
    }
}