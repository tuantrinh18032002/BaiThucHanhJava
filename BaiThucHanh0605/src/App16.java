import java.util.ArrayList;


public class App16 {
    public static void main(String[] args) throws Exception {
    //khai bao 1 Arraylist co ten la ArrlistString
    // co kieu la string
    ArrayList<String> arrayListString = new ArrayList<>();
    //them cac phan tu su dung phuong thuc add()
    arrayListString.add("JAVA");
    arrayListString.add("PHP");
    arrayListString.add("C#");
    arrayListString.add("C++");
    //Duyet theo kich thuoc cua arrListString
    //Su dung vong lap for thong thuong
    //phuong thuc arrListString.size() se tra ve so phan tu cua arrListString
    // Va sau do lay phan tu o vi tri  thu i thong qua get()    
    // sau do hien thi gia tri phan tu do ra 
    System.out.println("Cac phan tu trong arrListString la :");
    for (int i = 0; i < arrayListString.size(); i++)
    {
        System.out.print(arrayListString.get(i));
    }
}
}