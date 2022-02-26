import java.util.Scanner;

public class App9 {
    public static void main(String[] args) {
        System.out.print("Nhap vao 1 so nguyen duong: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("So theo thu tu nguoc lai: ");
        while (n > 0){
            System.out.print(n%10);
            n /= 10;
        }
    }
}