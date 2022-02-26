import java.util.Scanner;
public static void main (String[] args) {
    System.out.println("cac so chia het cho 5:");
    for (int i=0; i<=20;i++){ 
        if (i % 5 !=0){
            continue;
        }
        System.out.println(i);
    }
    
