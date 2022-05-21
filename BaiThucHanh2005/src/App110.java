import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App110 {
    public static void main(String[] args) {
        List<Integer> arrlistInteger = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        // phần tử của mảng
        int number; 
        System.out.println("Nhap so phan tu cua ArrayList: ");
        int n = scanner.nextInt();
        // nhập và thêm phần tử cho ArrayList
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu thu "+ i +": ");
            number = scanner.nextInt();
            arrlistInteger.add(number);
        }
         // tìm phần tử lớn nhất trong mngr
         int max = arrlistInteger.get(0);
         for(int i=1;i<arrlistInteger.size();i++){
             if(arrlistInteger.get(i).compareTo(max) > 0){
                 max = arrlistInteger.get(i);
             }
         }
         System.out.println("Phan tu lon nhat trong arrListInteger = "+max);
         //--------------------------------------------------------
         System.out.println("Nhap vao mot so nguyen bat ky : ");
         int number1 = scanner.nextInt();
         for(int i=0;i<arrlistInteger.size();i++){
             if(arrlistInteger.get(i).compareTo(number1)==0){
                    arrlistInteger.remove(i);
             }
         }
         System.out.println("Hien thi phan tu cua ArrayList: ");
         System.out.println(arrlistInteger);
         //---------------------------------------------------------
         Collections.sort(arrlistInteger);
         System.out.println("Day so da duoc sap xep la: ");
         System.out.println(arrlistInteger);
    }
    
}