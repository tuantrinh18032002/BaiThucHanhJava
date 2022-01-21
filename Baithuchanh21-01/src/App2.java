import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
        double hesoA1,hesoB1,hesoC1,hesoA2,hesoB2,hesoC2;
        double x,y,matranD,matranDx,matranDy;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao he so A1");
        hesoA1 = sc.nextDouble();
        System.out.print("Nhap vao he so B1");
        hesoB1 = sc.nextDouble();
        System.out.print("Nhap vao he so C1");
        hesoC1 = sc.nextDouble();
        System.out.print("Nhap vao he so A2");
        hesoA2 = sc.nextDouble();
        System.out.print("Nhap vao he so B2");
        hesoB2 = sc.nextDouble();
        System.out.print("Nhap vao he so C2");
        hesoC2 = sc.nextDouble();
     matranD= hesoA1*hesoB2-hesoA2*hesoB1;
     matranDx=hesoC1*hesoB2-hesoC2*hesoB1;
     matranDy=hesoA1*hesoC2-hesoA2*hesoC1;
     if (matranD==0){
         if (matranDx+matranDy==0)
         System.out.println("He phuong trinh vo so nghiem!");
         else 
         System.out.println("He phuong trinh vo nghiem!");
     }
     else {
         x=matranDx/matranD;
         y=matranDy/matranD;
         System.out.println("He phuong trinh co nghiem la : "
         + "x = "  + x + " và y = " + y);
     }
}
}
     

    
