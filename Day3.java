package day3;
import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nilai pertama : ");
        int nilaiPertama = input.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        int nilaiKedua = input.nextInt();
        System.out.println("Hasil Perkalian : " + nilaiPertama * nilaiKedua);
    }
    
}
