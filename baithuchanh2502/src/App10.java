import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        System.out.print("Nhap vao 1 so nguyen duong: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        int i = 0;
        while (n > 0){
            i++;
            n /= 10;
        }
        System.out.println("So " + k + " co " + i + " chu so");
    }
}