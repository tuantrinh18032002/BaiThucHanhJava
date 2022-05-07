import java.util.LinkedList;
public class App38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        System.out.println("Vi du phuong thuc addAll()");
        System.out.println("--------------------------");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA");
        showList(listA);
        System.out.println("\nvi du su dung phuong thuc retaiAll()");
        System.out.println("--------------------------------------");
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.println("listA");
        showList(listA);
        System.out.println("vi du ve su dung phuong thuc remove()");
        System.out.println("-------------------------------------");
        list.removeAll(listB);
        System.out.println("listB");
    }
    public static void showList(LinkedList<String> list) {
        for(String ojb : list) {
            System.out.println("\t" + ojb+ ", ");
        }
        System.out.println();
    }
}