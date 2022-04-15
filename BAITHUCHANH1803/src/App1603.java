import shapes.Hinhtron;
import shapes.Hinhchunhat;
import shapes.Person;
import shapes.Phuongtrinhbachai;
import shapes.Sinhvien;
public class App1603 {
    public static void main(String[] args) throws Exception {
        Hinhtron ht = new Hinhtron();
        Hinhchunhat hcn = new Hinhchunhat();
        Phuongtrinhbachai ptbh = new Phuongtrinhbachai();
        Sinhvien sv =new Sinhvien();
        Person ps = new Person();
          //Hinh tròn
          ht.nhapbankinh();
          ht.tinhchuvi();
          ht.tinhdientich();
          ht.inchuvi();
          ht.indientich();
 
         System.out.print("\n\n");
         //Hình chữ nhật
        
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
        
         System.out.print("\n\n");
         // Giải phương trình bậc 2
         ptbh.nhap();
         ptbh.in();

         System.out.print("\n\n");
         //Quản lý sinh viên
         sv.nhapMaSv();
         sv.nhapHoten();
         sv.nhapGioiTinh();
         sv.nhapDiaChi();
         sv.nhapNgaySinh();
         sv.inMaSv();
         sv.inHoten();
         sv.inGioitinh();
         sv.inDiaChi();
         sv.inNgaySinh();
     }
 }
         System.out.print("\n\n");
         //Thông tin đối tượng person
         ps.inAddress();
         ps.inGender();
         ps.inPersonID();
         ps.inPersonName();
    
         System.out.print("\n\n");
    }
}