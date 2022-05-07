import java.util.ArrayList;
import  java.util.ListIterator;
public class App19 {
    public static void main(String[] args) {
        //khai bao 1 Arraylist co ten la arrListChar
        // co kieu la character
        ArrayList<Character> arrListCharacter = new ArrayList<>();
        arrListCharacter.add('a');
        arrListCharacter.add('e');
        arrListCharacter.add('b');
        arrListCharacter.add('c');
        //khai bao mot ListIterator co kieu character
        ListIterator<Character> listIterator = arrListCharacter.listIterator();
        //hien thi cac phan tu co trong arrListchar
        //bang cach su dung ListIterator
        System.out.println(" cac phan tu trong arrListCharacter la :");
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + "\t" );
        }


    }
    
}
