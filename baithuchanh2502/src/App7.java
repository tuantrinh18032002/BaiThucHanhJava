import java.util.Scanner;

public class App7 {
    public static void main(String[] args) throws Exception {
        float a, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thuc a: ");
        a = sc.nextFloat();
        max = a;
        while (a != 0) {
            System.out.println("Nhap so thuc a: ");
            a = sc.nextFloat();
            if (a == 0)
                break;
            if (a > max)
                max = a;
        }
        System.out.println("Gia tri lon nhat trong cac so vua nhap la: " + max);
        sc.close();
    }
}