import java.util.Scanner;
public class App9 {
    public static void main(String[] args) throws Exception{
        String chuoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi: ");
        chuoi = sc.nextLine();
        int dem = chuoi.length();
        char kytu;
        System.out.println("Chuoi co " + dem + " ky tu. Bao gom: ");
        for(int i = 0;i < dem ; i++)
        {
            kytu = chuoi.charAt(i);
            System.out.println(kytu);
        }
        sc.close();
    }
}