import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("nhập vào số cần kiểm tra n: ");
    n = sc.nextInt();
    if (n % 2 == 0) {
        System.out.println(n + " là số chẵn!");
    } else {
        System.out.println(n + " là số lẻ");
    }
    sc.close();
    }
}