package day27;
import java.util.Scanner;
public class Day27 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Baris: ");
        int baris = scanner.nextInt();
        System.out.print("Kolom: ");
        int kolom = scanner.nextInt();

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }  
}
