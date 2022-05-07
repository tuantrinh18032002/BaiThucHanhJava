import java.util.ArrayList;
import java.util.Iterator;
public class App18 {
    public static void main(String[] args) {
        //khai bao arraylist co ten la arrListString
        // co kieu string
        ArrayList<Float> arrayListFloat = new ArrayList<>();
        // them cac phan tu su dung phuong thuc add()
        // chu f cho biet cac so them vao la so thuc
        // neu khong cp chu nay thi trinh bien dich se hieu day la so double
        // va se bao loi du lieu
        arrayListFloat.add(0.7f);
        arrayListFloat.add(7.26f);
        arrayListFloat.add(1.02f);
        arrayListFloat.add(9.3f);
        //khai bao mot Iterator co kieu laf float
        Iterator<Float> iterator = arrayListFloat.iterator();
          System.out.println("Cac phan tu trong arrListFloat la :");
          while (iterator.hasNext()){
              System.out.print(iterator.next() + "\t");
          }
    }

    
}
