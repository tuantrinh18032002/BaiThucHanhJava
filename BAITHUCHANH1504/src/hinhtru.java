package shapes;
import java.util.Scanner;

import Shapes.hinhtron;
public class hinhtru extends hinhtron {
    public float chieucao;
    //Costructor
    public hinhtru(){
        ten = "Hinh Tru ";
    }
    public void nhapchieucao(){
        nhapbankinh();
        System.out.println("Chieu cao =");
        Scanner scanner = new Scanner(System.in);
        chieucao = scanner.nextFloat();
    }
    public void tinhthetich(){
        tinhthetich();
        thetich = dientich * chieucao;

    }
    
}
