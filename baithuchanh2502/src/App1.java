import java.util.Scanner;
public class App1 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap so nguyen duong b: ");
        int b = scanner.nextInt();
       // tìm UCLN của a và b
       System.out.println("UCLN cua "+a+"va "+b+"la: "+UCLN(a,b));
    }
    public static int UCLN(int a, int b){
        if(b == 0)
        return a;
        return UCLN(b, a%b);
    }
}