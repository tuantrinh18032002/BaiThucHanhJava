import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen duong: ");
        int a = scanner.nextInt();
        if (kiemTraHoanThien(a)) {
            System.out.println("So " + a + " la so hoan thien");
        } else {
            System.out.println("So " + a + " khong la so hoan thien");
        }
    }

    private static boolean kiemTraHoanThien(int a) {
        int tong = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0){
                tong += i;
            }
        }
        return tong == a && a > 0;
    }
}