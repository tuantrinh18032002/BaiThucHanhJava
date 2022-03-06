import java.util.Scanner;
public class App11 {
    public static void main(String[] args) throws Exception{
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so phan tu cua mang: ");
            n = sc.nextInt();
            if(n<0)
                System.out.print("Gia tri khong hop le. Vui long nhap lai.\n");
        } while (n<0);
        int A[] = new int [n];
        int out[] = new int [n];
        System.out.println("Nhap cac phan tu cho mang.");
        for(int i = 0;i < n;i++)
        {
            System.out.print("Nhap phan tu thu " + (i+1) + " : ");
            A[i] = sc.nextInt();
            out[i] = A[i];//tmp de in ra man hinh ; A de sap xep
        }
        //Sap xep bbs
        int tmp;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (A[j] > A[j + 1])
                {
                    tmp = A[j];
                    A[j]=A[j+1];
                    A[j+1]=tmp;    
                }
        System.out.println("Day so ban dau: ");
        for(int i = 0;i < n;i++)
        {
            System.out.println(out[i]);
        }
        System.out.println("Day so sau khi sap xep: ");
        for(int i = 0;i < n;i++)
        {
            System.out.println(A[i]);
        }
        sc.close();
    }
}