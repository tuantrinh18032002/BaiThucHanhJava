package shape;
public class Triangle extends Point {
    private float a, b, c;
    Point p1 = new Point('A', 1, 2);
    Point p2 = new Point('B', 5, 7);
    Point p3 = new Point('C', 2, 8);

    public Triangle(char TenDiem, float HoanhDo, float TungDo) {
        super(TenDiem, HoanhDo, TungDo);
    }

    public void nhap() {
        System.out.println("Nhap diem thu nhat: ");
        p1.nhap();
        System.out.println("Nhap diem thu hai: ");
        p2.nhap();
        System.out.println("Nhap diem thu ba: ");
        p3.nhap();      
        a = (float)Math.sqrt(Math.pow(p1.getHoanhDo() - p2.getHoanhDo(), 2) + Math.pow(p1.getTungDo() - p2.getTungDo(), 2));
        System.out.println("Do dai canh A: " + a);
        b = (float)Math.sqrt(Math.pow(p2.getHoanhDo() - p3.getHoanhDo(), 2) + Math.pow(p2.getTungDo() - p3.getTungDo(), 2));
        System.out.println("Do dai canh B: " + b);
        c = (float)Math.sqrt(Math.pow(p1.getHoanhDo() - p3.getHoanhDo(), 2) + Math.pow(p1.getTungDo() - p3.getTungDo(), 2));
        System.out.println("Do dai canh C: " + c);
    }
    
    public void kiemtratamgiac() {
        if(a<b+c && b<a+c && c<a+b) {
            if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b) 
                System.out.print("Tam giac vuong");
            else if(a == b && b == c)
                System.out.print("Tam giac deu");
            else if(a == b || b == c || c == a)
                System.out.print("Tam giac can");
        }
        else 
            System.out.print("Khong phai la tam giac");
    }
    
}