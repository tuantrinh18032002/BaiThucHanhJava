import java.util.ArrayList;

public class App17 {
    public static void main(String[] args) {
        //khai bao 1 arryList co ten la arrListString 
        // co kieu la string 
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        // thhem cac phan tu su dung add()
        arrayListInteger.add(0);
        arrayListInteger.add(7);
        arrayListInteger.add(1);
        arrayListInteger.add(9);
        //duyet thee kich thuoc cua arrListInteger
        // su dung vong lap for duyet theo doi tuong
        // trong do kieu du lieu cua bien number
        // phai trung voi kieu du lieu cua arrListInteger
        System.out.println("Cac phan tu co trong arrListInteger la :");
         for (int number : arrayListInteger)
         {  
             System.out.print(number + "\t");
         }

    }
}
