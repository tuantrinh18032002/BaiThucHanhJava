import java.util.Scanner;
public class App35{
public static void main (String[] args){
    int so1 ,so2 , min ;
    Scanner scanner = new Scanner (System.in);
    System.out.println("nhap vao so thu nhat");
    so1= scanner.nextInt();
    System.out.println("nhap vao so thu hai");
    so2= scanner.nextInt();
    min=so1;
    if (so1>so2)
    min= so2;
    System.out.println("so nho nhat trong 2 so"+so1+ "va"+so2+"la"+min);
}

}
