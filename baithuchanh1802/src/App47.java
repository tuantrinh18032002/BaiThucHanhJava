import java.util.Scanner;
public class App47 {
    public static void main (String[] args){
        int so, tong=0;
        Scanner scanner = new Scanner (System.in);
        do {
            System.out.println("nhap so nguyen bat ky:");
                so = scanner.nextInt();
                tong += so;
        } while ( tong <100);
        System.out.println("tong cac so nguyen ="+tong);
    }
}
