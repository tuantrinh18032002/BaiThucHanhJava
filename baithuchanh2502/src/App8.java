import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        float n;
        float max = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap vao 1 so nguyên: ");
            n = sc.nextFloat();
            if (n > max && n % 5 == 0){
                max = n;
            }

        } while (n != 0);
        System.out.println("Gia tri lon nhat trong cac so chia het cho 5 vua nhap: " + max);

    }
}