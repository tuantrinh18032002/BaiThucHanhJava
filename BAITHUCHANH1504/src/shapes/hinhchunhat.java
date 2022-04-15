package shapes;
import java.util.Scanner;


public class hinhchunhat extends hinhoc {
    public float dai;
    public float rong;
  //Constructor
  public hinhchunhat (){
      ten = "Hinh chu nhat ";
  }
public void nhapchieudai(){
    System.out.println("chieu dai =");
    Scanner scanner = new Scanner(System.in);
dai = scanner.nextFloat();
}  
public void nhapchieurong(){
    System.out.println("chieu rong =");
    Scanner scanner = new Scanner(System.in);
rong = scanner.nextFloat();
}  
public void tinhchuvi(){
  chuvi = 2 * (dai + rong);
}
public void tinhdientich(){
    dientich = dai * rong;
}
}
