package day68;

import java.util.Scanner;

public class Day68 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan panjang array: ");
        int panjangArray = scanner.nextInt();
        
        int[] angkaArray = new int[panjangArray];
        
        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Masukkan nilai untuk elemen ke-" + i + ": ");
            angkaArray[i] = scanner.nextInt();
        }
        System.out.print("Nilai array yang dimasukkan: ");
        for (int i = 0; i < panjangArray; i++) {
            System.out.print(angkaArray[i] + " ");
        }
        boolean adaNilaiLebihBesarDari10 = false;
        System.out.println("\nNilai yang lebih besar dari 10: ");
        for (int i = 0; i < panjangArray; i++) {
            if (angkaArray[i] > 10) {
                System.out.print(angkaArray[i] + " ");
                adaNilaiLebihBesarDari10 = true;
            }
        }
        if (!adaNilaiLebihBesarDari10) {
            System.out.println("Tidak ada nilai yang lebih besar dari 10.");
        }
    }
}
