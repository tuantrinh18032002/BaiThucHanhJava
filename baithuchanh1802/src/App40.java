import java.util.Scanner;
public class APP40 {
    public static void main(String agre[]) {
        Scanner scanner = new Scanner (System.in);
        int ngay = scanner.nextInt();
        switch(ngay) {
            case 0:System.out.println("Chu nhat");
                break;
            case 1:System.out.println("Thu hai");
                break;
            case 2:System.out.println("Thu ba");
                break;
            case 3:System.out.println("Thu tu");
                break;
            case 4:System.out.println("Thu nam");
                break;
            case 5:System.out.println("Thu sau");
                break;
            case 6:System.out.println("Thu bay");
                break;
            default:System.out.println("So ngay trong tuan sai");
        }
    }
}
