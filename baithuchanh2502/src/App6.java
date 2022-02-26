import java.util.Scanner;
public class App6 {
    public static void main(String[] args)throws Exception{
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("In ra so hoan thien nho hon n.");
        do {
            System.out.println("n= ");
            n = sc.nextInt();
            if(n < 0)
                System.out.println("Gia tri khong hop le. Vui long nhap lai.");
        } while (n < 0);
        //
        if (n > 6) 
        {
            for(int i = 6;i < n;i++)
            {
                if(check(i)==true)
                    System.out.println(i);
            }
        }
        else 
        {
            System.out.println("Khong co so hoan thien nao nho hon "+n);
        }
        sc.close();
    }
    //
    public static boolean check(int n){
        int tong = 0;
        for(int i = 1;i <= n/2;i++){
            if((n % i) == 0)
                tong+=i;
        }
        if (tong == n) {
            return true;
        }
        return false;
    }
}