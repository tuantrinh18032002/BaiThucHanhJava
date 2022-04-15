package Shapes;
import java.util.Scanner;
import shapes.hinhoc;
public class hinhtron extends hinhoc  {
    public float bankinh;
   
    //Constructor
    public hinhtron() {
        ten = "Hình Tròn";
    }
    public  void nhapbankinh() {
        System.out.println( "Ban kinh =");;
        Scanner scanner = new Scanner(System.in);
        bankinh = scanner.nextFloat();
    }
    public void tinhchuvi() {
         chuvi =  2 * PI * bankinh; 
    }
    public void tinhdientich(){
        dientich = PI * bankinh * bankinh;

    }
}
 

    
