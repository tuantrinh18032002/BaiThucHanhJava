package Person;
import java.util.Scanner;
public class Student extends Person{
    public String LoaiSv;   
    public void nhap() {
        System.out.println("Nhap ten: ");
        Scanner sc = new Scanner(System.in);
        sc.close();
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
    }
    public void xuatLoaiSV() {
        System.out.println("\n\n==== " + LoaiSv + " ====");
    }
}
          

       