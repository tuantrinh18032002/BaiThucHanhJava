import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        float a = scanner.nextFloat();
        System.out.print("Nhap canh b: ");
        float b = scanner.nextFloat();
        System.out.print("Nhap canh c: ");
        float c = scanner.nextFloat();
        if (b+c > a && a+c > b && a+b > c){
            if (b == c && c == a){
                System.out.println("Tam giac deu");
            } else if (b == c || c == a){
                if ((b*b + c*c) == a*a || (b*b + a*a) == c*c || (c*c + a*a) == b*b){
                    System.out.println("Tam giac vuong can");
                } else {
                    System.out.println("Tam giac can");
                }
            } else if ((b*b + c*c) == a*a || (b*b + a*a) == c*c || (c*c + a*a) == b*b){
                System.out.println("Tam giac vuong");
            } else {
                System.out.println("Tam giac thuong");

            }
        } else {
            System.out.println("3 so vua nhap khong phai la canh cua tam giac");
        }
    }
}