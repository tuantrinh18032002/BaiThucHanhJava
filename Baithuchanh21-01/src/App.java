import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      Double heSoA,heSoB,heSoC,delta;
      double x1,x2;
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhap vao he so A :") ;
      heSoA = sc.nextDouble();
      System.out.println("Nhap vao he so B :") ;
      heSoB = sc.nextDouble();
      System.out.println("Nhap vao he so C :") ;
      heSoC = sc.nextDouble();
      //tinh delta
      delta = heSoB * heSoB - 4 * heSoA * heSoC;
      //tinh nghiem
      if (delta > 0) {
        x1 =  (-heSoB + Math.sqrt(delta)) / (2 * heSoA);
        x2 =  (-heSoB - Math.sqrt(delta)) / (2 * heSoA);
        System.out.println("Phương trình có 2 nghiệm là: "
                + "x1 = " + x1 + " và x2 = " + x2);
      }
      else if(delta == 0){
        x1 = (- heSoB / (2 * heSoA));
        System.out.println("Phương trình có nghiệm kép: "
                + "x1 = x2 = " + x1);
    }
    else {
        System.out.println("Phương trình vô nghiệm!");
    }
}
}

  