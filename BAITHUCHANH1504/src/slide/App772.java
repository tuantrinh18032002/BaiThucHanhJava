package slide;

import java.util.Scanner;

public class hinhtron extends hinhhoc {  
    protected float bankinh;
    private Scanner sc;

    public hinhtron() {
        super();
        sc = new Scanner(System.in);
    }

    public void nhapbankinh() {
        System.out.println("Ban dung don vi tinh nao: ");
        System.out.println("\t1 - Centimet");
        System.out.println("\t2 - Inch");
        config.donvi = sc.nextInt();

        System.out.println("Hay nhap vao ban kinh hinh tron: ");
        bankinh = sc.nextFloat();
    }

    public void inthongtin() {
        if(config.donvi == config.DON_VI_CM) {
            System.out.println("Hinh tron co ban kinh " + bankinh + " cm");
            System.out.println("Tuong duong " + config.ChuyenCentimetSangInch(bankinh) + " inch");
        } else {
            System.out.println("Hinh tron co ban kinh " + bankinh + " inch");
            System.out.println("Tuong duong " + config.ChuyenInchSangCentimet(bankinh) + " cm");
        }
    }
}