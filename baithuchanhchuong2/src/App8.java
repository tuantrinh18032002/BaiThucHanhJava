import java.util.Scanner;
public class App8 {
    public static void main(String[] args) throws Exception{
        int n,a;
        Scanner sc = new Scanner(System.in);
        System.out.print("So cac so trong day so la: ");
        n = sc.nextInt();
        float tong = 0;
        for(int i = 0;i < n; i++)
        {
            System.out.print("Nhap so thu " + (i+1) + " : ");
            a = sc.nextInt();
            tong = tong + a;
        }
        System.out.println("Trung binh cong cua "+ n + " so nguyen da nhap la: " + (tong/n));
        sc.close();
    }
}