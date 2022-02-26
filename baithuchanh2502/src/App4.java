import java.util.Scanner;

public class App4 {
    public static boolean SNT(int n) {
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                temp++;
            }
        }
        if (temp == 2) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n :");
        n = scanner.nextInt();
        System.out.println("Cac so nguyen to nho hon " + n + " la :");
        for (int i = 1; i < n; i++) {
            if (SNT(i) == true) {
                System.out.print(i + "\t");
            }
        }
    }
}