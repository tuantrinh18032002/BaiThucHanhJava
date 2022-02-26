public class App11 {
    public static void main(String[] args)throws Exception{
        int i,j,k;
        System.out.println("Cac phuong an co the de co tong 200000 tu 3 loai giay bac 10 000 dong, 20 000 dong va 50 000 dong la: ");
            for(i=0;i<=4;i++)
                for(j=0;j<=10;j++)
                    for(k=0;k<=20;k++)
                        if((i*50000+j*20000+k*10000)==200000)
                            System.out.println(k+" to 10 000 dong + "+ j + " to 20 000 dong + " + i +" to 50 000 dong.");
    }
}