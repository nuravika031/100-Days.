package day28;
import java.util.Scanner;
public class Day28 {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan maksimal : ");
        int bilanganMaksimal = input.nextInt();
        System.out.println("Jumlah bilangan ganjil dari 1 hingga " + bilanganMaksimal + " adalah :");
        
        for (int i = 1; i <= bilanganMaksimal; i++) {
            if (i % 2 !=0)
    System.out.println(i);         
    }
   } 
}
