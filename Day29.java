package day29;
import java.util.Scanner;
public class Day29 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka untuk tabel perkalian : ");
        int angka = input.nextInt();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(angka + " * " + i + " = " + (angka * i));
    }
  } 
}
