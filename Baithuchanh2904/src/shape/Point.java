package shape;
import java.lang.ref.Cleaner;
import java.util.Scanner;
public class Point {
    public  String tenDiem;
    public float HoanhDo;
    public float TungDo;
    
    public Point(String tenD, float hd, float td) {
         this.tenDiem = tenD;
         this.HoanhDo = hd;
         this.TungDo = td;
    }
    public String gettenDiem() {
     return this.tenDiem;
    }
    public void settenDiem(String tenD) {
        this.tenDiem = tenD;
    }
    public float getHoangDo() {
        return this.HoanhDo;
    }
    public void setHoanhDo(float hd) {
        this.HoanhDo = hd;
    }
    public float getTungDo() {
        return this.TungDo;
    }
    public void setTungDo(float td) {
        this.TungDo = td;
    }
    public void Nhap() {
         System.out.println("Nhap ten diem : ");
         Scanner sc = new Scanner(System.in);
         tenDiem = sc.next();
         System.out.println("Nhap hoanh do :");
         HoanhDo = sc.nextFloat();
         System.out.println("Nhap tung do :");
         TungDo = sc.nextFloat();
    }
    public void In() {
        System.out.printf(tenDiem + "("+HoanhDo + "," +TungDo+")");
    }
 }