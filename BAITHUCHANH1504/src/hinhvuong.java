package shapes;
import java.util.Scanner;

import shapes.hinhchunhat;
public class hinhvuong extends hinhchunhat {
    
    //Constructor
    public hinhvuong(){
        ten = " hinh vuong ";
    }
    public void nhapcanh(){
        System.out.println("Canh =");
        Scanner scanner = new Scanner(System.in);
        dai = rong = scanner.nextFloat();
    }
    
}
