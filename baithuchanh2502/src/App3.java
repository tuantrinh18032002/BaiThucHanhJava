import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n = ");
        n = sc.nextInt();

        if (n < 2) {
            System.out.println("n không phải là số nguyên tố");
        }

        boolean isSoNguyenTo = true;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                isSoNguyenTo = false;
                break;
            }
        }

        if (isSoNguyenTo) {
            System.out.println("n là số nguyên tố");
        } else {
            System.out.println("n không phải là số nguyên tố");
        }
    }
}