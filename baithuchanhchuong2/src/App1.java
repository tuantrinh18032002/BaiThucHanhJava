import java.util.Scanner;
public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int b = sc.nextInt();
        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
        int tich = a * b;
        System.out.println(a + " * " + b + " = " + tich);
        float thuong = (float) a / b;
        System.out.println(a + " / " + b + " = " + thuong);  
        int phanDu = a % b;
        System.out.println(a + " % " + b + " = " + phanDu);
        System.out.println("Kết quả so sánh bằng 2 số " + a + " và " +  b + " là " + (a == b));
        System.out.println("Kết quả so sánh lớn hơn 2 số " + a + " và " +  b + " là " + (a > b));
        System.out.println("Kết quả so sánh nhỏ hơn 2 số " + a + " và " +  b + " là " + (a < b));
        sc.close();
    }
}