import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App111 {
    public static void main(String[] args) {
        List<Integer> listInteger = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        float averg = 0f;
        // phần tử của mảng
        int number; 
        System.out.println("Nhap so phan tu cua listInteger: ");
        int n = scanner.nextInt();
        // nhập và thêm phần tử cho ArrayList
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu thu "+ i +": ");
            number = scanner.nextInt();
            listInteger.add(number);
        }
        int count = 0;
        for(int i=0;i<listInteger.size();i++){
            if(listInteger.get(i)%2==0){
                sum += listInteger.get(i);
                count++;
            }
        }
        averg = (float)sum/count;
       
        System.out.println("Trung binh cong la = " + averg);
        
    }
    
}